package com.kodilla.collections.interfaces.homework;

public class Mini implements Car{
    private int start_speed;

    public Mini(int start_speed) {
        this.start_speed = start_speed;
    }
    @Override
    public int getSpeed() {
        return start_speed;
    }

    @Override
    public void getIncreaseSpeed() {
        start_speed = start_speed + 10;}

    @Override
    public String toString() {
        return "Mini{" +
                "start_speed=" + start_speed +
                '}';
    }

    @Override
    public void getDecreaseSpeed() {

        start_speed=start_speed - 17;

    }
}
