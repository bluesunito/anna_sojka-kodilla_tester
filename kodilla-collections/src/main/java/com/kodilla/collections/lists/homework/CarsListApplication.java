package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Ford());
        Toyota toyota = new Toyota();
        cars.add(toyota);
        cars.add(new Opel());
        cars.add(new Ford());

        System.out.println(cars.size());

        for (Car car : cars){
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        cars.remove(toyota);

        System.out.println("");
        System.out.println(cars.size());
        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }
}
