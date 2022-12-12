package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {
    //Tworzymy obiekt klasy
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    //Tworzymy mocka dla klas Client, Notification, Location
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

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
        //weatherAlertService.addLocalization(localization);
        weatherAlertService.removeSubscriber(client);
        weatherAlertService.removeLocation(location);
        weatherAlertService.sendNotification(notification, "Bydgoszcz");
        //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    //Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    public void shouldClientStopReceivingNotifications() {
        //Wywołujemy metody, które chcemy przetestować
        weatherAlertService.removeAllLocation(location);
        weatherAlertService.removeSubscriber(client);
        weatherAlertService.sendNotification(notification, "Warszawa");
        //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    public void shouldLimitedGroupOfClientsReceiveNotification(){
        //Wywołujemy metody, które chcemy przetestować
        //weatherAlertService.addSubscriber(client,localization);
        //weatherAlertService.addLocalization(localization);
        weatherAlertService.addSubscriber(client, "Michałowice");
        weatherAlertService.sendNotification(notification, "Michałowice");
        //  //Sprawdzamy czy metoda receive została wywołana
        Mockito.verify(client, Mockito.times(1)).receive(notification);
}
    @Test
    //Możliwość wysyłki powiadomienia do wszystkich.
public void shouldAllSubsribersNotifications(){
        //Wywołujemy metody, które chcemy przetestować
        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);

        weatherAlertService.addSubscriber(firstClient, "Szczecin");
        weatherAlertService.addSubscriber(secondClient, "Michałowice");
        weatherAlertService.addSubscriber(thirdClient, "Kraków");
        //weatherAlertService.addSubscriber(localization, firstClient);
        //weatherAlertService.addSubscriber(localization, secondClient);
        //weatherAlertService.addSubscriber(localization, thirdClient);

        weatherAlertService.sendNotification(notification, "Szczecin");
        weatherAlertService.sendNotification(notification, "Michałowice");
        weatherAlertService.sendNotification(notification, "Kraków");
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }
    @Test
    //Możliwość skasowania danej lokalizacji.
    public void ShouldBeAbleToDeleteCurrentLocation() {
        //Możliwość skasowania danej lokalizacji.
        weatherAlertService.removeLocation(location);
        weatherAlertService.sendNotification(notification, "Warszawa");
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}
