//package com.kodilla.spring.basic.spring_dependency_injection.homework;
//
//import org.springframework.stereotype.Component;
////Utworzono klasę, która jest komponentem Springa i ma pole
//@Component
//public class Calculator {
//    private Display display;
//    //Konstruktor inicjuje pole
//    //Wstrzykując beana przez konstruktora do beana Calculator
//    //Spring wie, że obie klasy są beanami i umie je powiązać
//    public Calculator (Display display) {
//        this.display = display;
//    }
//    //Metoda dodawanie dwóch wartości
//    public double add (double a, double b) {
//    double result = 0;
//    result = a + b;
//    display.display(result);
//    return result;
//    }
//    //Metoda odejmowanie dwóch wartości
//    public double subtract (double a, double b) {
//    return (a - b);
//    }
//    //Metoda mnożenie dwóch wartości
//    public double multiply (double a, double b){
//        return (a * b);
//    }
//    //Metoda dzielenie dwóch wartości
//    public  double divide (double a, double b) {
//        return (a/b);
//    }
//}
