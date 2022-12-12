package com.kodilla.spring.basic.dependecy_injection.homework;
//Interfejs będący serwisem do wysyłania powiadomień
public interface NotificationService{
        //Metoda success wyświetla adres
        void success(String address);
        //Metoda fail wyświetla adres
        void fail(String address);
        }