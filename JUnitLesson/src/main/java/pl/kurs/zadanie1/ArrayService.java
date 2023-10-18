package pl.kurs.zadanie1;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ArrayService {

    public Optional<Integer> suma(int[] tab) {
        if (tab == null) {
            return Optional.empty();
        }
        return Optional.of(Arrays.stream(tab).sum());
    }

    public Optional<Integer> iloczyn(int[] tab) {
        if (tab == null || tab.length == 0) {
            return Optional.empty();
        }
        return Optional.of(Arrays.stream(tab).reduce(1, (a, b) -> a * b));
    }

    public OptionalInt max(int[] tab) {
        if (tab == null) {
            return OptionalInt.empty();
        }
        return Arrays.stream(tab).max();
    }

    public Optional<int[]> podwajaElementy(int[] tab) {
        if (tab == null) {
            return Optional.empty();
        }
        return Optional.of(Arrays.stream(tab).map(x -> x * 2).toArray());
    }

    public Optional<int[]> sort(int[] tab) {
        if (tab == null) {
            return Optional.empty();
        }
        return Optional.of(Arrays.stream(tab).sorted().toArray());
    }
}
