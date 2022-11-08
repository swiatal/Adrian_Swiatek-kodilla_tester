package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {


    private int start_speed;


    public Opel(int start_speed) {
        this.start_speed = start_speed;
    }
    @Override
    public int getSpeed() {
        return  start_speed;
    }

    @Override
    public void getIncreaseSpeed() {
        start_speed = start_speed + 18;
    }

    @Override
    public void getDecreaseSpeed() {
        start_speed=start_speed - 5;

    }
}
