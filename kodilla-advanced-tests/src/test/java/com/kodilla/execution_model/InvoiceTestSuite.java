package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class InvoiceTestSuite {

        Invoice invoice = new Invoice();
        Item Juice = new Item("Juice", 2.20 );
        Item Bread = new Item("Bread", 3.30 );
        Item Butter = new Item("Butter", 4.20);
//Test sprawdzający, czy czy rozmiar listy się zmienia po dodaniu nowych pozycji
        @Test
        public void shouldAddItemsToInvoice() {

        int numberOfItems = invoice.getSize();
        //then
        assertEquals(3, numberOfItems);
    }
//Test sprawdzający, czy po pobraniu pozycji z faktury, wartość, nazwy i cena są zgodne z oczekiwaniami
        @Test
        public void shouldGetAlreadyMadeItem() {

        Item result = invoice.getItem(1);
        assertEquals("Bread", result.getName());
        assertEquals(3.30, result.getPrice(), 0.01);
    }
//Test sprawdzający pobranie elementu o ujemnym indeksie
    @Test
    public void shouldGetNullWhilePassingNegativeIndex() {
        invoice.addItem(Juice);
        invoice.addItem(Bread);
        invoice.addItem(Butter);

        Item result = invoice.getItem(-2);
        assertNull(result);
    }
//Test sprawdzający pobranie elementu spoza listy
    @Test
    public void shouldGetNullWhilePassingOutsideOfRange() {

        Item result = invoice.getItem(5);
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice(){
            invoice.addItem(Juice);
            invoice.addItem(Bread);
            invoice.addItem(Butter);
    }
    @AfterEach
    public void resetValues() {
            System.out.println("Resetting values...");
    }
    @BeforeAll
    public static void displayMessage() {
            System.out.println("Starting values");
    }
    @AfterAll
    public static void displayGoodbyeMessage() {
            System.out.println("Finishing testing");
    }
}
