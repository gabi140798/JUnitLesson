package pl.kurs.zadanie1;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ArrayService {

    public int sumaTablicy(int[] tab) {
        Optional.ofNullable(tab).orElseThrow(()->new ArrayIsNullException("tablica jest nulem"));
        return Arrays.stream(tab).sum();
    }

    public Optional<Integer> iloczynTablicy(int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new ArrayIsNullException("Array is null");
        }
        return Optional.of(Arrays.stream(tab).reduce(1, (a, b) -> a * b));
    }

    public OptionalInt najwiekszaLiczbaWTablicy(int[] tab) {
        if (tab == null) {
           throw new ArrayIsNullException("Array is null");
        }
        return Arrays.stream(tab).max();
    }

    public int[] podwajanieElementowTablicy(int[] tab) {
        if (tab == null) {
           throw new ArrayIsNullException("Array is null");
        }
        return Arrays.stream(tab).map(x -> x * 2).toArray();
    }

    public Optional<int[]> sortowanieTablicy(int[] tab) {
        if (tab == null) {
           throw new ArrayIsNullException("Array is null");
        }
        return Optional.of(Arrays.stream(tab).sorted().toArray());
    }
}
