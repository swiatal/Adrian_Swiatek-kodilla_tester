package com.kodilla.exception.homework;

import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTest {
    @Test
    public void testReturnException() {
        //given
        Warehouse warehouse = new Warehouse();
        String number = "2022/2";
        //when
//        warehouse.addOrder();
        //then
        assertThrows(OrderDoesntExistException.class,() -> warehouse.getOrder(number));
    }
    @Test
    public void testReturnOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        //when
        Order result = warehouse.getOrder("123");
        //then
        assertEquals("123", result.getNumber());
    }
}
