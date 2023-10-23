package pl.kurs.zadanie2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirmaTest {

    private Firma f1;
    private FirmaService fs1;

    @Before
    public void setup() {
        f1 = new Firma("Firma");
        fs1 = new FirmaService();

    }

    @Test
    public void sprawdzCzyDlugoscNazwyFirmySieZgadza() {
        assertEquals(5,f1.getNazwa().length());
    }

}