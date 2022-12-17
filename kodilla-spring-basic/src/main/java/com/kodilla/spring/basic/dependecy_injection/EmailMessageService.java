package com.kodilla.spring.basic.dependecy_injection;

import org.springframework.stereotype.Service;

@Service
public class EmailMessageService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending [" + message + "] to: " + receiver + " via Email");
    }
}
