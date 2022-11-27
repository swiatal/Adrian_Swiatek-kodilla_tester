package com.kodilla.exception.homework;
import java.util.HashSet;
import java.util.Set;
public class Warehouse {

    public static Set<Order> addOrder(Order order){
        Set<Order> orders = new HashSet<>();
        orders.add(order);
        return orders;
    }
    public static Set<Order> getOrder(String number) throws OrderDoesntExistException {
        Set<Order> orders = Warehouse.addOrder(Order order)
                .stream()
                .filter(order->order.getNumber().equals("2022/2"))
                .findAny().get();
        if (result.isEmpty()){
            //w przypaku braku zamówienia ostanie rzucony wyjątek
            throw new OrderDoesntExistException();
        }
        return orders;
    }
}
