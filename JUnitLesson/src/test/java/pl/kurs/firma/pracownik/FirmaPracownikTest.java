package pl.kurs.firma.pracownik;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.zadanie2.Firma;
import pl.kurs.zadanie2.FirmaService;
import pl.kurs.zadanie2.Pracownik;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FirmaPracownikTest {

    private FirmaService firmaService;
    private Firma firma;
    private Pracownik p1;
    private Pracownik p2;
    private List<Pracownik> lista;

    @Before
    public void setup() {
        firmaService = new FirmaService();
        firma = new Firma("Firma");
        firma.getListaPracownikow().clear();
        p1 = new Pracownik("Adam", "Kowalski", 10000);
        p2 = new Pracownik("Katarzyna", "Nowak", 4000);
        firma.dodajPracownika(p1);
        firma.dodajPracownika(p2);
    }

    @Test
    public void imiePracownika() {
        assertEquals("Adam", p1.getImie());
    }

    @Test
    public void dlugoscNazwyFirmy() {
        assertEquals(5, firma.getNazwa().length());
    }

    @Test
    public void pensjaPracownika() {
        assertEquals(4000, p2.getPensja(), 0.01);
    }

    @Test
    public void liczbaAsocjacji() {
        assertEquals(2, firma.getListaPracownikow().size());
    }




    @Test
    public void wylczeniePensjiPracownika() {
        assertEquals(10000, p1.getPensja(), 0.01);
    }

    @Test
    public void pensjaWszystkichPracownikow() {
        assertEquals(14000, firmaService.wyplataDlaWszystkichPracownikow(firma), 0.01);
    }
}

