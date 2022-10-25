package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

    public Windows10 (int year) {
        super(year);
    }

        @Override
        public void turnOn () {
            System.out.println("Witam w systemie windows 10");
        }
        public void turnOff () {
            System.out.println("Windows 10 żegna");
        }
    }

