package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100, 1, 50, 120);
        doRace(ford);
        Mini mini = new Mini(100, 2, 10, 220);
        doRace(mini);
        Opel opel = new Opel(100, 4, 5, 110);
        doRace(opel);
    }
    private static void doRace(Car car) {
        System.out.println(car.getIncreaseSpeed());
        System.out.println(car.getIncreaseSpeed());
        System.out.println(car.getIncreaseSpeed());
        System.out.println(car.getDecreaseSpeed());
        System.out.println(car.getDecreaseSpeed());
        System.out.println(car.getSpeed());
    }
}


