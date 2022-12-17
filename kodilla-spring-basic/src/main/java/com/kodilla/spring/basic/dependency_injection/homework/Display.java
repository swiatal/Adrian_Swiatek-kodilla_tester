package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.stereotype.Component;

//Utworzono klase, która jest komponentem Springa
@Component
public class Display {
    //metoda wyświetlająca tekst
    public double display(double value) {
        System.out.println("Value is : " + value);
        return value;
    }
}