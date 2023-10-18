package pl.kurs.firma.pracownik;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.zadanie2.Firma;
import pl.kurs.zadanie2.Pracownik;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FirmaPracownikTest {

    private Firma firma;
    private Pracownik p1;
    private Pracownik p2;

    private List<Pracownik> lista;

    @Before
    public void setup() {
        firma = new Firma("SuperFirma");
        p1 = new Pracownik("Jan", "Kowalski", 5000);
        p2 = new Pracownik("Anna", "Nowak", 6000);
        firma.dodajPracownika(p1);
        firma.dodajPracownika(p2);
    }

    @Test
    public void testImiePracownika() {
        assertEquals("Jan", p1.getImie());
    }

    @Test
    public void testDlugoscNazwyFirmy() {
        assertEquals(10, firma.getNazwa().length());
    }

    @Test
    public void testPensjaPracownika() {
        assertEquals(5000, p1.getPensja(), 0.01);
    }

    @Test
    public void testLicznoscAsocjacji() {
        assertEquals(2, firma.getListaPracownikow());
    }

    @Test
    public void testLicznoscEkstensji() {
        assertEquals(2, firma.getListaPracownikow());
    }

    @Test
    public void testPensjaWyliczalnaDlaPracownika() {
        assertEquals(5000, p1.getPensja(), 0.01);
    }

    @Test
    public void testCalkowitaPensjaFirmy() {
        assertEquals(11000, firma.wyplataDlaWszystkichPracownikow(), 0.01);
    }
}

