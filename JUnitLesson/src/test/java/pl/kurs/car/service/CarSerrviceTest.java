package pl.kurs.car.service;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.car.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CarSerrviceTest {

    private CarService service;
    private Car car1;
    private Car car2;
    private Car car3;
    private Car car4;

    private List<Car> cars;

    @Before
    public void init() {
        service = new CarService();

        car1 = new Car("bmw", 35);
        car2 = new Car("audi", 43);
        car3 = new Car("bmw", 11);
        car4 = new Car("polonez", 12);

        cars = new ArrayList<>(List.of(car1, car2, car3, car4));
    }

    @Test
    public void shouldReturnOldestCar() {
        Car oldest = car2;
        Car result = service.oldestCar(cars);
        assertEquals(oldest, result);
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldReturnNullWhenListIsNull() {
        List<Car> listForTest = null;
        assertNull(service.oldestCar(listForTest));
    }

    @Test
    public void shouldReturnAllBmws() {
        List<Car> bmw = new ArrayList<>(List.of(car1, car3));
        assertEquals(bmw, service.carsByProducer(cars, "bmw"));
    }


}