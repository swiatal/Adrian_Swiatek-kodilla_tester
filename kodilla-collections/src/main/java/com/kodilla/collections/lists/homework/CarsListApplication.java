package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mini;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(10);
        cars.add(new Ford(10));
        cars.add(new Mini(15));
        cars.add(new Opel(25));
        cars.add(ford);

        CarUtils carUtils = new CarUtils();
        for (Car car : cars) {
            carUtils.describeCar(car);
        }
        cars.remove(2);
        cars.remove(ford);

        System.out.println(cars.size());
        for (Car car : cars) {
            carUtils.describeCar(car);
        }
    }
}
