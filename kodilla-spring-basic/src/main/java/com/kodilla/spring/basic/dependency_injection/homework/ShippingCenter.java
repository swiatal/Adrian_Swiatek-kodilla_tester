//package com.kodilla.spring.basic.spring_dependency_injection.homework;
//
//import org.springframework.stereotype.Component;
////Utworzono klasę, która jest komponentem Springa i ma pola
//@Component
//public class ShippingCenter {
//    private NotificationService notificationService;
//    private DeliveryService deliveryService;
//
//    //Konstruktor inicjuje pole
//    //Wstrzykując beana przez konstruktora do beana Calculator
//    //Spring wie, że obie klasy są beanami i umie je powiązać
//
//    public ShippingCenter (DeliveryService deliveryService, NotificationService notificationService){
//        this.deliveryService = deliveryService;
//        this.notificationService = notificationService;
//    }
//
//    public String sendPackage(String address, double weight) {
//        if (deliveryService.deliverPackage(address, weight)) {
//            return notificationService.success(address);
//        }
//        return notificationService.fail(address);
//    }
//}
