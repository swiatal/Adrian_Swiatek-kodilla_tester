package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher(int salary, String responsibilities) {

        super (salary, responsibilities);
    }
    @Override
    public void responsibilitiesInWork() {
        System.out.println("giving homeworks");
    }
}

