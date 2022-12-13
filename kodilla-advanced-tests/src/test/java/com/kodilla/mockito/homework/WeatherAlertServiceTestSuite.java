package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {
    //Tworzymy obiekt klasy
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    //Tworzymy mocka dla klas Client, Notification, Location
    Client client = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    //Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia
    public void shouldClientCanBeSignedInLocation() {
        //Wywołujemy metody, które chcemy przetestować
        weatherAlertService.addSubscriber(client, "Michałowice");
        //weatherAlertService.addLocation(location);
        //weatherAlertService.subscribeToLocalization(localization, client);
        weatherAlertService.sendNotification(notification,"Michałowice");
        //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    //Można wycofać subskrypcję z danej lokalizacji.
    public void shouldClientDeleteLocationSubscription() {
        //Wywołujemy metody, które chcemy przetestować
        weatherAlertService.addSubscriber(client,"Bydgoszcz");
        weatherAlertService.deleteClientFromLocation("Bydgoszcz",client);
        weatherAlertService.sendNotification(notification, "Bydgoszcz");
        //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    @Test
    public void shouldDeleteClientOnlyFromOneLocation() {
        weatherAlertService.addSubscriber(client,"Bydgoszcz");
        weatherAlertService.addSubscriber(client,"Warszawa");
        weatherAlertService.deleteClientFromLocation("Bydgoszcz",client);
        weatherAlertService.sendNotification(notification, "Bydgoszcz");
        weatherAlertService.sendNotification(notification, "Warszawa");
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    //Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    public void shouldClientStopReceivingNotifications() {
        //Wywołujemy metody, które chcemy przetestować
        weatherAlertService.addSubscriber(client,"Bydgoszcz");
        weatherAlertService.addSubscriber(client,"Warszawa");
        weatherAlertService.addSubscriber(client,"Wrocław");
        weatherAlertService.removeSubscriber(client);
        weatherAlertService.sendNotification(notification, "Warszawa");
        weatherAlertService.sendNotification(notification, "Bydgoszcz");
        weatherAlertService.sendNotification(notification, "Wrocław");
        //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    public void shouldLimitedGroupOfClientsReceiveNotification(){
        //Wywołujemy metody, które chcemy przetestować
        weatherAlertService.addSubscriber(client, "Michałowice");
        weatherAlertService.addSubscriber(client2, "Michałowice");
        weatherAlertService.addSubscriber(client3, "Michałowice");
        weatherAlertService.sendNotification(notification, "Michałowice");

        //  //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
}
    @Test
    //Możliwość wysyłki powiadomienia do wszystkich.
    public void shouldAllSubsribersNotifications(){
        //Wywołujemy metody, które chcemy przetestować

        weatherAlertService.addSubscriber(client, "Szczecin");
        weatherAlertService.addSubscriber(client2, "Michałowice");
        weatherAlertService.addSubscriber(client3, "Kraków");
        //weatherAlertService.sendNotification(notification, "Szczecin");
        //weatherAlertService.sendNotification(notification, "Michałowice");
        //weatherAlertService.sendNotification(notification, "Kraków");
        weatherAlertService.NotifyAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }
    @Test
    //Możliwość skasowania danej lokalizacji.
    public void ShouldBeAbleToDeleteCurrentLocation() {
        //Możliwość skasowania danej lokalizacji.
        weatherAlertService.addSubscriber(client, "Szczecin");
        weatherAlertService.addSubscriber(client2, "Michałowice");
        weatherAlertService.addSubscriber(client3, "Kraków");
        weatherAlertService.removeLocation("Szczecin");
        weatherAlertService.sendNotification(notification, "Szczecin");
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}
