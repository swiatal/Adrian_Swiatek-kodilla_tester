package com.kodilla.execution_model.homework;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    //Przeniesienie zmiennych z wnętrza metod testujących do zmiennych klasy
    //Given
    Shop shop = new Shop();
    LocalDate localDate = LocalDate.of(2020,12,01);
    LocalDate localDate2=LocalDate.of(2021, 10, 02);
    LocalDate localDate3=LocalDate.of(2022, 12, 15);
    Order Piotr = new Order(1230.5,localDate,  "Piotr");
    Order Zosia = new Order(1500.9, localDate2, "Zosia");
    Order Franek = new Order(2500.0,  localDate3, "Franek");

    //Przypadki testowe

    //1. Dodanie nowego zamówienia (Order) i sprawdzenie czy rozmiar listy się zmienia
    //When
    @Test
    public void shouldAddOrdersToShop() {
        shop.addOrder(Piotr);

        int numberOfOrder = shop.getSize();
        //Then
        assertEquals(1, numberOfOrder);
    }
    //2. Wpisanie zakresu dat (od do) i sprawdzenie czy pokazuje nam zamówienia z tego zakresu
    //When
    @Test
    public void shouldGetDateOrders() {

       shop.addOrder(Zosia);
       shop.addOrder(Piotr);
       shop.addOrder(Franek);
        List<Order> result = shop.getOrdersByDate(LocalDate.of(2020,11,1),LocalDate.of(2021,12,15));//nazwa zmiennej z kolekcji metody getOrdersByDate
       assertEquals(2,result.size());

    }
    //3. Pobranie zamówienia o danej wartości i sprawdzenie czy wartość jest prawidłowa
    @Test
    public void shouldGetValueOrders() {
        shop.addOrder(Zosia);
        shop.addOrder(Piotr);
        shop.addOrder(Franek);
        List<Order> result = shop.getOrdersByValue(1230, 2400);

        //Then
        assertEquals(2, result.size());
    }

        //5. Zsumowanie wartości wszystkich zamówień i sprawdzenie czy wartość się zgadza
    @Test
    public void shouldSumTotalValue(){
        shop.addOrder(Zosia);
        shop.addOrder(Piotr);
        shop.addOrder(Franek);
        double sumResult = shop.sumOrder();
    //Then
        assertEquals(5231.4, sumResult);
}
    //Zdefiniowanie co ma się wykonać po każdym teście
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    //Zdefiniowanie co ma się uruchomić przed wszystkimi testami
    //Musi być statyczna, ponieważ nie działa na konkretnym obiekcie tylko jest wspólna dla całego testu
    @BeforeAll
    public static void displayMessage() {
        System.out.println("Starting values");
    }

    //Zdefiniowanie co ma się wykonać po wszystkich testach
    //Musi być statyczna, ponieważ nie działa na konkretnym obiekcie tylko jest wspólna dla całego testu
    @AfterAll
    public static void displayGoodbyeMessage() {
        System.out.println("Finishing testing");
    }
    }









