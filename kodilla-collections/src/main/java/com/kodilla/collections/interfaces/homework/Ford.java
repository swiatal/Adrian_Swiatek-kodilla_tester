package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int distance_traveled;
    private int time_elapsed;

    private int start_speed;
    private int final_speed;

    public Ford(int distance_traveled, int time_elapsed,int  start_speed, int final_speed) {
        this.distance_traveled = distance_traveled;
        this.time_elapsed = time_elapsed;
        this.start_speed = start_speed;
        this.final_speed = final_speed;
    }

    public int getSpeed() {

        return  distance_traveled/time_elapsed;
    }

    public void getIncreaseSpeed() {

        final_speed=start_speed/time_elapsed;
    }
    public void getDecreaseSpeed() {

        start_speed=final_speed/time_elapsed;
}
}

