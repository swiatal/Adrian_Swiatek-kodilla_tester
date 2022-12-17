package com.kodilla.spring.basic.dependecy_injection;
//Interfejs będący serwisem do wysyłania wiadomości
public interface MessageService {
    //Metoda send wyświetla tekst wiadomości oraz odbiorcę
    void send (String message, String receiver);
    }
