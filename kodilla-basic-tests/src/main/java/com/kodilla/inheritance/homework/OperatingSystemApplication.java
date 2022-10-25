package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        Windows10 windows10 = new Windows10(2007);
        windows10.turnOn();
        Windows7 windows7 = new Windows7(2011);
        windows7.turnOff();
    }
}
