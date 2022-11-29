package com.kodilla.exception.homework;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
public class Warehouse {
            private Set<Order> orders = new HashSet<>();
    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder (String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(o->o.getNumber().equals(number))
                .findAny().orElseThrow(OrderDoesntExistException::new);
    }
}
