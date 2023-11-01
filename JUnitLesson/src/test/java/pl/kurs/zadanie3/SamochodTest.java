package pl.kurs.zadanie3;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class SamochodTest {

    @Test
    public void testLamborghini() {
        SoftAssertions softAssertions = new SoftAssertions();

        try {
            Samochod samochod = new Samochod("Lambo", "Aventador", 2022, 4, 5000);
        } catch (IllegalArgumentException e) {
            softAssertions.assertThat(e.getMessage()).isEqualTo("Lamborghini musi mieć 2 drzwi!");
        }

    }

    @Test
    public void testNaZmiejszeniePrzebiegu() {
        SoftAssertions softAssertions = new SoftAssertions();

        Samochod samochod = new Samochod("Audi", "A4", 2022, 4, 5000);
        samochod.zmniejszPrzebieg(1000);
        softAssertions.assertThat(samochod.getPrzebieg()).isEqualTo(4000);

        try {
            samochod.zmniejszPrzebieg(5000);
        } catch (IllegalArgumentException e) {
            softAssertions.assertThat(e.getMessage()).isEqualTo("Wartość zmniejszana nie może być większa niż przebieg!");
        }

    }

    @Test
    public void testNaRokProdukcjiWPrzyszłości() {
        SoftAssertions softAssertions = new SoftAssertions();

        try {
            Samochod samochod = new Samochod("BMW", "335i", 2025, 4, 0);
        } catch (IllegalArgumentException e) {
            softAssertions.assertThat(e.getMessage()).isEqualTo("Rok produkcji nie może być w przyszłości!");
        }

        softAssertions.assertAll();
    }
}
