package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {
    //Tworzymy obiekt klasy
    NotificationService notificationService = new NotificationService();
    //Tworzymy mocka dla klas Client, SecondClient, Third Client, Notification
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    //Klient nie posiadający subskrybcji nie powinien otrzymać powiadomień
    public void notSubscribedClientShouldNotReceiveNotification() {
        //NotificationService notificationService = new NotificationService();
        //Client client = Mockito.mock(Client.class);
        //Notification notification = Mockito.mock(Notification.class);

    //Wywołujemy metodę (wyślij powiadomienie), którą chcemy przetestować
        notificationService.sendNotification(notification);
        //Sprawdzamy, czy metoda recive (otrzymać) nigdy (Mockito.never) w klasie Client nie została wywołana
        //z podanym argumentem notyfication
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    //klient który subskrybuje powinien otrzymać powidomienie tylko raz
    public void subscribedClientShouldReceiveNotification() {
        //NotificationService notificationService = new NotificationService();
        //Client client = Mockito.mock(Client.class);

        //wywołujemy metodę(dodajemy subskrybenta)
        notificationService.addSubscriber(client);
        //Notification notification = Mockito.mock(Notification.class);
        //wywołujemy metode(wysyłamy powiadomienie)
        notificationService.sendNotification(notification);
        //Sprawdzamy czy metoda receive, czy klient otrzyma tylko jedno powiadomienie
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    //powiadomienie powinno zostać wysłanie do wszystkich subskrybujących klientów
    public void notificationShouldBeSentToAllSubscribedClients() {
        //NotificationService notificationService = new NotificationService();
        //Client firstClient = Mockito.mock(Client.class);
        //Client secondClient = Mockito.mock(Client.class);
        //Client thirdClient = Mockito.mock(Client.class);
        //notificationService.addSubscriber(firstClient);
        //notificationService.addSubscriber(secondClient);
        //notificationService.addSubscriber(thirdClient);
        //Notification notification = Mockito.mock(Notification.class);

        //dodjemy subskrybentów (w klasie notification service, musimy stworzyć kolekcje klientów)
        addSubscribers(client, secondClient, thirdClient);
        //wywołujemy metode(wysyłamy powiadomienie)
        notificationService.sendNotification(notification);
        //sprawdzamy czy metoda recive została wywołana
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    //klient moze mieć wiele subscypcji ale otrzyma jedno powidowmienie

    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        //NotificationService notificationService = new NotificationService();
        //Client client = Mockito.mock(Client.class);
        //notificationService.addSubscriber(client);
        //notificationService.addSubscriber(client);
        //notificationService.addSubscriber(client);
        //Notification notification = Mockito.mock(Notification.class);
        //
        addSubscribers(client, client, client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    //klient nieposiadający subskrybcji nie będzie otrzymywać powidowmień
    //Klient może dodać subskrypcję i będzie otrzymywać powiadomienia
    public void unsubscribedClientShouldNotReceiveNotification() {
        //NotificationService notificationService = new NotificationService();
        //Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        //Notification notification = Mockito.mock(Notification.class);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    private void addSubscribers(Client... clients) {
        for(Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }
}
