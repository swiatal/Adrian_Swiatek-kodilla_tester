package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int start_speed;

    public Ford(int  start_speed) {
        this.start_speed = start_speed;
    }

    public int getSpeed() {

        return  start_speed;
    }

    public void getIncreaseSpeed() {

        start_speed = start_speed + 15;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "start_speed=" + start_speed +
                '}';
    }

    public void getDecreaseSpeed() {



}
}

