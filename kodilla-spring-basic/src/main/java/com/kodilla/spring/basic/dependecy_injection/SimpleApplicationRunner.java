package com.kodilla.spring.basic.dependecy_injection;

public class SimpleApplicationRunner {
    public static void main (String[] args) {
        //tworzymy obiekt FacebookMessageService,
        //przypisujemy go do referencji typu MessageService (możemy tak zrobić,
        // ponieważ MessageService jest typem wyższym, w drugą stronę to nie zadziała),
        // następnie przekazujemy do konstruktora klasy SimpleApplication
        // SimpleApplication otrzymuje zależność z zewnątrz.
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}
