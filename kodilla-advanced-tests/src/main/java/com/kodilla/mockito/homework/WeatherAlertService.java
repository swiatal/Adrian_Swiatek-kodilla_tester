package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    //private Map<String,Set<Client>> clients = new HashMap<>();
    Map<Localization, Set<Client>> localizationClientMap = new HashMap<>();


    //Osoba zainteresowana może zostać zapisana do danej lokalizacji

    //public void addSubscriber(Client client, String location) {
        //if(clients.containsKey(location)){
            //clients.get(location).add(client);
        //} else {
            //Set<Client> clientSet = new HashSet<>();
            //clientSet.add(client);
            //clients.put(location,clientSet);
        //}
    //}

    public void subscribeToLocalization (Localization localization, Client client) {
        this.localizationClientMap.get(localization).add(client);
    }

    //Każda wiadomość powinna dotrzeć do subskrybentów
    //public void sendNotification(Notification notification, String location) {
        //if(clients.containsKey(location)){
            //this.clients.get(location).forEach(client -> client.receive(notification));
        //}
    //}

    public void sendNotification (Notification notification){
        this.localizationClientMap.forEach((localization, client) -> client.recive(notification));
    }


    //Metoda- usunięcie wszystkich lokalizacji
    public void removeAllLocalization(Localization localization) {
        this.localizationClientMap.remove(localization);
    }
    //Metoda- skasowanie subskrybującego
    public void  removeSubscriber(Client client) {
        this.localizationClientMap.remove(client);
    }
    //metoda skasowania lokalizacji
    public void removeLocalization(Localization localization) {
        this.localizationClientMap.remove(localization);
    }
}
