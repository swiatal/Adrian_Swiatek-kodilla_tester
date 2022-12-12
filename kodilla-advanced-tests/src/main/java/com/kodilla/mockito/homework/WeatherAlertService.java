package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private Map<String,Set<Client>> clients = new HashMap<>();
    //Map<Localization, Set<Client>> localizationClientMap = new HashMap<>();
    //Set<Client> clientSet = new HashSet<>();

    //Osoba zainteresowana może zostać zapisana do danej lokalizacji

    public void addSubscriber(Client client, String location) {
        if(clients.containsKey(location)){
            clients.get(location).add(client);
        } else {
            Set<Client> clientSet = new HashSet<>();
            //umieszczamy obiekty w mapie clients
            clientSet.add(client);
            clients.put(location,clientSet);
        }
    }

    //public void subscribeToLocalization (Localization localization, Client client) {
        //this.localizationClientMap.get(localization).add(client);
    //}

    //Każda wiadomość powinna dotrzeć do subskrybentów
    public void sendNotification(Notification notification, String location) {
        if(clients.containsKey(location)){
            this.clients.get(location).forEach(client -> client.receive(notification));
        }
    }

    //public void sendNotification (Notification notification){
        //this.clients.forEach((localization, client) -> client.remove(notification));
    //}


    //Metoda- usunięcie wszystkich lokalizacji
    public void removeAllLocation(Location location) {
        this.clients.remove(location);
    }
    //Metoda- skasowanie subskrybującego
    public void  removeSubscriber(Client client) {
        this.clients.remove(client);
    }
    //metoda skasowania lokalizacji
    public void removeLocation(Location location) {
        this.clients.remove(location);
    }
}
