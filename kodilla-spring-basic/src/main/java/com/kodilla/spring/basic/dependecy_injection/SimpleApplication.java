package com.kodilla.spring.basic.dependecy_injection;

public class SimpleApplication {

    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }
    //Metoda processMessage najpierw sprawdza, czy odbiorca jest poprawny,
    //a następnie wywołuje metodę bezpośrednio odpowiedzialną za wysyłanie wiadomości
    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }
    //działanie SimpleApplication jest zależne od działania MessageService
    //wiadomość nie zostanie wysłana, jeśli MessageService nie zadziała prawidłowo
    //tym sposobem powstała zależność (and. dependency)
    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
