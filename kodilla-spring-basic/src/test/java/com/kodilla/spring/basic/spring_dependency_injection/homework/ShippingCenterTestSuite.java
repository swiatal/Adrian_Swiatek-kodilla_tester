//package com.kodilla.spring.basic.spring_dependency_injection.homework;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import static org.junit.jupiter.api.Assertions.*;
//
////Adnotacja uruchamia Springowy kontekst na czas działania testów
//@SpringBootTest
//public class ShippingCenterTestSuite {
//
//    @Test
//    public void shouldReturnFalseIfPackageTooHeavy() {
//        //Pobierany jest kontekst Springowy
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        //Kontekst jest przypisany do zmiennej, więc korzystamy z metody getBean
//        //Szuka ona beana określonego typu
//        DeliveryService bean = context.getBean(DeliveryService.class);
//        boolean result = bean.deliverPackage("ul. Krakowska 9, Kraków", 35);
//        assertFalse(result);
//    }
//    @Test
//    public void shouldReturnTrueIfPackageNotTooHeavy() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
//        DeliveryService bean = context.getBean(DeliveryService.class);
//        boolean result = bean.deliverPackage("ul. Krakowska 9, Kraków", 25);
//        assertTrue(result);
//    }
//    @Test
//    public void shouldDeliverPackage() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
//        NotificationService bean = context.getBean(NotificationService.class);
//        String address = bean.success("ul. Krakowska 9, Kraków");
//        Assertions.assertNotNull(address);
//    }
//    @Test
//    public void shouldNotDeliverPackage() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
//        NotificationService bean = context.getBean(NotificationService.class);
//        String address = bean.fail("ul. Krakowska 9, Kraków");
//        Assertions.assertNotNull(address);
//    }
//}
