package pl.kurs.zadanie1;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ArrayService {

    public int sumaTablicy(int[] tab) {
        Optional.ofNullable(tab).orElseThrow(() -> new ArrayIsNullException("Tablica jest nullem!"));
        return Arrays.stream(tab).sum();
    }

    public Optional<Integer> iloczynTablicy(int[] tab) {
        Optional.ofNullable(tab).orElseThrow(() -> new ArrayIsNullException("Tablica jest nullem!"));
        return Optional.of(Arrays.stream(tab).reduce(1, (a, b) -> a * b));
    }

    public OptionalInt najwiekszaLiczbaWTablicy(int[] tab) {
        Optional.ofNullable(tab).orElseThrow(() -> new ArrayIsNullException("Tablica jest nullem!"));
        return Arrays.stream(tab).max();
    }

    public int[] podwajanieElementowTablicy(int[] tab) {
        Optional.ofNullable(tab).orElseThrow(() -> new ArrayIsNullException("Tablica jest nullem!"));
        return Arrays.stream(tab).map(x -> x * 2).toArray();
    }

    public Optional<int[]> sortowanieTablicy(int[] tab) {
        Optional.ofNullable(tab).orElseThrow(() -> new ArrayIsNullException("Tablica jest nullem!"));
        return Optional.of(Arrays.stream(tab).sorted().toArray());
    }
}
