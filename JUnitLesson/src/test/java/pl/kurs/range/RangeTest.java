package pl.kurs.range;

import org.junit.*;

import static org.junit.Assert.*;


public class RangeTest {

    // testy jednostkowe - testuja jak najmniejszy fragment kodu, pojedyncza metoda
    // powinne byc niezalezne
    // nie boimy sie dlugich nazw metod, powinne byc zrozumiale i odzwierciedlac co dany test sprawdza
    // test to po prostu metoda z adnotacja @Test

    private Range range;


    @Before // uruchamia sie przed kazdym testem
//    @After uruchamia sie po kazdym tescie
//    @BeforeClass uruchama sie na poczatku klasy
//    @AfterClass   uruchama sie na koncu klasy
    public void init(){
        range = new Range(10, 20);
    }

    @Test
    public void shouldReturnTrueIfNumberIsInTheRange() {
        boolean result = range.isInTheRange(20);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsOutOfTheRange() {
        assertFalse(range.isInTheRange(21));
    }

    @Test
    public void shouldReturn20OnGetRangeTo(){
        assertEquals(20, range.getRangeTo());
    }

    @Test
    public void shouldCompareDoubles(){
        double a = 2, b = 2;
        assertEquals(a, b, 0.1);
    }

    @Test
    public void shouldRangeBeNull(){
        range = null;
        assertNull(range);
    }

    @Test
    public void shouldRangeNotBeNull(){
        assertNotNull(range);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenRangeFromIsBiggerThanRangeTo(){
        range = new Range( 20, 19);
    }

}