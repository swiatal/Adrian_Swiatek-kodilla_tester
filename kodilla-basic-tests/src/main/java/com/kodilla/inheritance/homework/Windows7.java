package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {

public Windows7 (int year){
    super(year);
}

public void turnOn() {
    System.out.println("Witam w systemie Windows 7");
}

public void turnOff() {
    System.out.println("Windows wylogowuje użytkownika");
}
}

