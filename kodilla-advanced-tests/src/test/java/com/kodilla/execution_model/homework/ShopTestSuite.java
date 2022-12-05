package com.kodilla.execution_model.homework;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    //Przeniesienie zmiennych z wnętrza metod testujących do zmiennych klasy
    //Given
    Shop shop = new Shop();

    Order Piotr = new Order(1230.5, 2020-12-01,"Piotr");
    Order Zosia = new Order(1500.9, 2021 - 10 - 02, "Zosia");
    Order Franek = new Order(2500.0,  2022 - 12 - 15, "Franek");

    //Przypadki testowe
    //Każdy test otrzyma nowy obiekt klasy, w której jest uruchamiany.
    //Zestaw danych w klasie (obiekty typu Shop i Order) zostaną utworzone na nowo dla każdego testu.

    //1. Dodanie nowego zamówienia (Order) i sprawdzenie czy rozmiar listy się zmienia
    //When
    @Test
    public void shouldAddOrdersToShop() {
        int numberOfOrder = shop.getSize();
        //Then
        assertEquals(3, numberOfOrder);
    }
    //2. Wpisanie zakresu dat (od do) i sprawdzenie czy pokazuje nam zamówienia z tego zakresu
    //When
    @Test
    public void shouldGetDateOrders() {
        List<Order> result = shop.getOrdersByDate(startDate, endDate);//nazwa zmiennej z kolekcji metody getOrdersByDate
        List<Order> expectedDate = new ArrayList<>();                 //mozliwość wpisania daty początk i końcowej
        expectedDate.add(new Order(1230.5, 2020 - 12 - 01, "Piotr"));
        expectedDate.add(new Order(1500.9, 2021 - 10 - 02, "Zosia"));
        //Then
        assertEquals(2020 - 2022, result());
    }
    //3. Pobranie zamówienia o danej wartości i sprawdzenie czy wartość jest prawidłowa
    @Test
    public void shouldGetValueOrders() {
        List<Order> result = shop.getOrdersByValue(min, max);//nazwa zmiennej z kolekcji metody getOrdersByDate
        List<Order> expectedValue = new ArrayList<>();                 //mozliwość wpisania daty początk i końcowej
        expectedValue.add(new Order(1230.5, 2020 - 12 - 01, "Piotr"));
        expectedValue.add(new Order(1500.9, 2021 - 10 - 02, "Zosia"));
        //Then
        assertEquals(2731.4, result());
    }
    //4. Usunięcie zamówienia i sprawdzenie czy rozmiar listy się zmienia
    @Test
        public void shouldDeleteOrder() {
            shop.getSize();
            assertEquals(0, shop.getSize());
    }
        //5. Zsumowanie wartości wszystkich zamówień i sprawdzenie czy wartość się zgadza
    @Test
    public void shouldSumTotalValue(){
        double sumResult = shop.sumOrder();
    //Then
        assertEquals(5231.4, sumResult);
}
    // Zdefiniowanie co ma się wykonać przed każdym testem
    @BeforeEach
    public void initializeShop(){
        shop.addOrder(Piotr);
        shop.addOrder(Zosia);
        shop.addOrder(Franek);
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









