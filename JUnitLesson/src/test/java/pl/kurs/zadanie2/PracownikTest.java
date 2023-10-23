package pl.kurs.zadanie2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PracownikTest {

    private Pracownik p1;
    private Pracownik p2;
    private PracownikService ps1;


    @Before
    public void setup() {
        Pracownik.getPracownicy().clear();
        p1 = new Pracownik("Adam", "Kowalski", 10000);
        p2 = new Pracownik("Katarzyna", "Nowak", 4000);
        ps1 = new PracownikService();
    }


    @Test
    public void sprawdzaCzyEkstensjaWynosi2() {
        assertEquals(2, Pracownik.getPracownicy().size());
    }

    @Test
    public void sprawdzaCzyEkstensjaWynosi3() {
        Pracownik pracownik = new Pracownik("Adam", "aksd", 234);
        assertEquals(3, Pracownik.getPracownicy().size());
    }

    @Test
    public void sprawdzCzyImiePracownikaSieZgadza() {
        assertEquals("Adam",p1.getImie());
    }

    @Test
    public void czyPensjaPracownikaSieZgadza() {
        assertEquals(10000,0,p1.getPensja());
    }



}