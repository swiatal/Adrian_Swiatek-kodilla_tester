package com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> school = new ArrayList<>();
    public School(List<Double> school) {
        this.school = school;
    }

    public double getAverage(){
        double sum = 0.0;
        for (double school : school)
            sum += school;
        return sum/ school.size();
    }
    @Override
    public String toString() {
        return "School:" + school.toString();
    }
    }

