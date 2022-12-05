package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Klasa, która przechowuje kolekcję unikalnych zamówień
public class Shop {
    //Obiekt
    private List<Order> orders = new ArrayList<>();

    //1. Metoda dodająca nowe zamówienie
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    //2. Metoda zwracająca listy zamówień z zakresu dwóch dat
    public List<Order> getOrdersByDate (LocalDate startDate, LocalDate endDate){
        List<Order> results = new ArrayList<>();
        for (Order order:orders){
            if (order.getDate().isAfter(startDate)&& order.getDate().isBefore(endDate)){
                results.add(order);
            }
        }
        return results;
    }
    //3. Metoda pobierająca zamówienia na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)
    public List<Order> getOrdersByValue (int min, int max) {
        List<Order> results = new ArrayList<>();
        for (Order order:orders) {
            if (order.getOrderValue() > min && order.getOrderValue() < max) {
                results.add(order);
            }
        }
        return results;
    }
    //4. Metoda zwracająca liczbę zamówień
    public int getSize() {
        return this.orders.size();
    }
    //5. Metoda sumująca wartość wszystkich zamówień
    public double sumOrder() {
        double sum = 0;
        for (Order order : orders) {
            sum = sum + order.getOrderValue();
        }
        return sum;
    }
}
