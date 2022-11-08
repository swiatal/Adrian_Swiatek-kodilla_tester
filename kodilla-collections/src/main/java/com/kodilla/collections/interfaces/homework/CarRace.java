package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100);
        doRace(ford);
        Mini mini = new Mini(100);
        doRace(mini);
        Opel opel = new Opel(100);
        doRace(opel);
    }
    private static void doRace(Car car) {
        car.getIncreaseSpeed();
       car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getDecreaseSpeed();
       car.getDecreaseSpeed();
        System.out.println(car.getSpeed());
    }
}


