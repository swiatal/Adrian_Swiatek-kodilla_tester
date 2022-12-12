package com.kodilla.spring.basic.dependecy_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService = new DeliveryService() {
        //Metoda zwraca false, jeśli waga przekracza 30
        //Wyświetla się komunikat "Package too heavy"
        @Override
        public boolean deliverPackage(String address, double weight) {
            if (weight > 30) {
                System.out.println("Package too heavy");
                return false;
            }else {
                //Metoda zwraca true
                //Wyświetla się komunikat "Delivering in progress..."
                System.out.println("Delivering in progress...");
                return true;
            }
        }
    };

    private NotificationService notificationService = new NotificationService() {

        @Override
        public void success(String address) {
            System.out.println("package delivered to: " + address);
        }
        @Override
        public void fail(String address) {
            System.out.println("Package not delivered to: " + address);
        }
    };
    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}


