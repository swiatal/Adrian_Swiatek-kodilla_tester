package com.kodilla.school;

public class Student {
    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }

    public void addMathsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.maths.add(grade);
        }
    }

    public void addPhysicsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physics.add(grade);
        }
    }

    public void addGeographyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geography.add(grade);
        }
    }

    public void addHistoryGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.history.add(grade);
        }
    }

    public double getMathsAverage() {
        return this.maths.GetAverage();
    }

    public double getPhysicsAverage() {
        return this.physics.GetAverage();
    }

    public double getGeographyAverage() {
        return this.geography.GetAverage();
    }

    public double getHistoryAverage() {
        return this.history.GetAverage();
    }
    public double GetAverage() {
        return -1;
    }
    public double getAverage() {
        double sum = this.geography.GetAverage() + this.history.GetAverage() + this.maths.GetAverage() + this.physics.GetAverage();
        return sum/4;
    }
}
