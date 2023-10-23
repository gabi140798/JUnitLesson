package pl.kurs.zadanie1;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalInt;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    private ArrayService arrayService;
    private int[] tab1;
    private int[] tab2;


    @Before
    public void init() {
        arrayService = new ArrayService();
        tab1 = new int[4];
        tab1[0] = 20;
        tab1[1] = 4;
        tab1[2] = 120;
        tab1[3] = 65;
        tab2 = new int[6];
        tab2[0] = 300;
        tab2[1] = 12;
        tab2[2] = 6;
        tab2[3] = 321;
        tab2[4] = 99;
        tab2[5] = 63;
    }

    @Test
    public void shouldReturnSumOfArray() {
        assertEquals(Optional.of(209),arrayService.sumaTablicy(tab1));
    }

    @Test
    public void shouldReturnTheProductOfAnArray() {
        assertEquals(Optional.of(624000),arrayService.iloczynTablicy(tab1));
    }

    @Test
    public void shouldReturnTheBiggestAmountFromArray() {
        assertEquals(OptionalInt.of(321),arrayService.najwiekszaLiczbaWTablicy(tab2));
    }

    @Test
    public void shouldReturnDoubleTheNumberOfElementsOfTheArray() {
        int[] expectedDoubledArray = {600,24,12,642,198,126};
        Optional<int[]> result = arrayService.podwajanieElementowTablicy(tab2);
        assertArrayEquals(expectedDoubledArray, result.orElseThrow());
    }

    @Test
    public void shouldReturnASortedArray() {
        int[] sortedArray = {4,20,65,120};
        Optional<int[]> result = arrayService.sortowanieTablicy(tab1);
        assertArrayEquals(sortedArray, result.orElseThrow());
    }

}