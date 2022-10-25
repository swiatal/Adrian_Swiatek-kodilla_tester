package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

public void turnOn(){
    System.out.println("Witam w systemie z" + year + "roku");
}
public void turnOff(){
    System.out.println("Zamykanie systemu");
}
public int getYear() {return year; }
}


