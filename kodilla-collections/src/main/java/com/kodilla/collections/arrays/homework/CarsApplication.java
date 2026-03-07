package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int carsCount = RANDOM.nextInt(15) + 1;

        Car[] cars = new Car[carsCount];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);

        Car car;

        if (drawnCarKind == 0)
            car = new Ford();
        else if (drawnCarKind == 1)
            car = new Opel();
        else
            car = new Toyota();

        int randomAcceleration = RANDOM.nextInt(10);

        for (int i = 0; i < randomAcceleration; i++) {
            car.increaseSpeed();
        }

        return car;
    }
}
