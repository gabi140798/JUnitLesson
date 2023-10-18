package pl.kurs.car.service;

import pl.kurs.car.model.Car;

import java.util.*;

public class CarService {
    public Car oldestCar(List<Car> list) {
        return Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(Car::getAge))
                .orElseThrow(); // powinien byc wlasny wyjatek
    }

    public List<Car> carsByProducer(List<Car> list, String producer) {
        return Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getProducer() != null)
                .filter(c -> c.getProducer().equals(producer))
                .toList();
    }
}
