package com.kodilla.collections.adv.maps.complex;


import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades) {
        this.grades = grades;
        }
    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }
    public String getAverage() {
        return "10";
    }
    }
