package com.kodilla.spring.basic.dependecy_injection.homework;
//Interfejs będący serwisem dostawczym
public interface DeliveryService {
     //Metoda deliverPackage wyświetla adres i wagę
     boolean deliverPackage (String address, double weight);
}
