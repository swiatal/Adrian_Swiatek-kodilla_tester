package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Klasa Order, która reprezentuje dane dotyczące zamówienia
//Każdy obiekt nowego typu zawiera wartość zamówienia, datę i login osoby dokonującej zamówienia
public class Order {
    private double orderValue;
    private LocalDate date;
    private String login;

//Konstruktor inicjuje pola
    public Order(double orderValue, LocalDate date, String login) {
        this.orderValue = orderValue;
        this.date = date;
        this.login = login;
    }
//Metoda pozwalająca wywołać wartości prywatnych zmiennych
    public double getOrderValue() {
        return orderValue;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getLogin() {
        return login;
    }
// Nadpisanie metody, która nie ma żadnych argumentów
    //Metoda zwraca napis, który składa się z nazwy i wartości atrybutów klasy
    @Override
    public String toString() {
        return "Order{" + "orderValue='" + orderValue + '\''
                        + ", date:" + date + '\''
                        + ", login:" + login + '}';
    }
}
