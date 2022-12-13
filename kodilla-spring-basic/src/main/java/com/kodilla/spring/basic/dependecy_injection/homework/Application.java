package com.kodilla.spring.basic.dependecy_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService() {
            @Override
            public boolean deliverPackage(String address, double weight) {
                return false;
            }
        };
        NotificationService notificationService = new NotificationService() {
            @Override
            public void success(String address) {
            }
            @Override
            public void fail(String address) {
            }
        };
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.success("Hill Street 11, New York");
        shippingCenter.fail("Valley Street 11, New York");
    }
}
