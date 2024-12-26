package pl.kurs.zadanie1;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalInt;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    private ArrayService arrayService;
    private int[] tab1;


    @Before
    public void init() {
        arrayService = new ArrayService();
        tab1 = new int[]{1, 6, 10, -5};
    }

    @Test
    public void shouldReturnSumOfArray() {
        assertEquals(12,arrayService.sumaTablicy(tab1));
    }

//
//    @Test
//    public void shouldReturnTheProductOfAnArray() {
//        assertEquals(Optional.of(624000),arrayService.iloczynTablicy(tab1));
//    }
//
//    @Test
//    public void shouldReturnTheBiggestAmountFromArray() {
//        assertEquals(OptionalInt.of(321),arrayService.najwiekszaLiczbaWTablicy(tab1));
//    }

    //    @Test
//    public void shouldReturnASortedArray() {
//        int[] sortedArray = {4,20,65,120};
//        Optional<int[]> result = arrayS                              ervice.sortowanieTablicy(tab1);
//        assertArrayEquals(sortedArray, result.orElseThrow());
//    }
    @Test
    public void shouldReturnDoubleTheNumberOfElementsOfTheArray() {
        int expected = 2 * arrayService.sumaTablicy(tab1);
        int[] doubleTab = arrayService.podwajanieElementowTablicy(tab1);
        int result = arrayService.sumaTablicy(doubleTab);
        assertEquals(expected, result);
    }

    // assertj biblioteka nastawiona na testowanie wyjatkow

    @Test(expected = ArrayIsNullException.class)
    public void shouldThrowArrayIsNullExceptionWhenArrayIsNull2(){
        tab1 = null;
        arrayService.sumaTablicy(tab1);
    }

    @Test
    public void shouldThrowArrayIsNullExceptionWhenArrayIsNull(){
        tab1 = null;

        Exception exception = new ArrayIsNullException("tablica jest nulem");

        // wyciagniecie wyjatku za pomoca lambda wyrazenia

        Exception e = assertThrows(ArrayIsNullException.class, ()-> arrayService.sumaTablicy(tab1));

//        assertEquals(exception.getMessage(), e.getMessage());

        Assertions.assertThat(e)
                .hasSameClassAs(exception)
                .hasFieldOrProperty("message")
                .hasMessage("tablica jest nulem");

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(e.getClass()).isEqualTo(IllegalArgumentException.class);
        softAssertions.assertThat(e.getMessage()).isEqualTo("Tablica jest nullem");
        softAssertions.assertThat(e.getMessage()).contains("kljgd");
        softAssertions.assertAll();
    }

    // todo
      /*
            Stworz klase Samochod ktora ma marke, model, rok produkcji, liczbe drzwi oraz przebieg
            Jesli marka to lambo to sprawdz czy samochod ma 2 drzwi
            Stworz metode do zmniejszania przebiegu -> wartosc zmniejszana nie moze byc wieksza niz przebieg
            Sprawdzaj czy data produkcji nie jest w przyszlosc

            Stworz testy uzywajac assertj i softasseracji
         */
}