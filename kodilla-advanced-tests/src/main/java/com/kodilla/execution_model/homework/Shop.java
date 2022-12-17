package com.kodilla.execution_model.homework;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//Klasa, która przechowuje kolekcję unikalnych zamówień
public class Shop {
    //Obiekt
    private List<Order> orders = new ArrayList<>();

    //1. Metoda dodająca nowe zamówienie
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    //2. Metoda zwracająca listy zamówień z zakresu dwóch dat

    public List<Order> getOrdersByDate (LocalDate startDate, LocalDate endDate){
        //tworzymy pustą listę zamówień
        //nazwa listy dowolna, np: results
        List<Order> results = new ArrayList<>();
        //robimy pętlę po wszystkich zamówieniach z listy do której dodawaliśmy, czyli
        //po wszystkich zamówieniach, czyli po wszystkich obiektach typu Order
        for (Order order:orders){
            //mamy x zamówień
            //chcemy wyszukać zamówienie w danym okresie
            //musimy sprawdzić czy każde zamówienie jest w tej dacie, czyli
            //czy data zamówienia jest po dacie początkowej i przed datą końcową
            if (order.getDate().isAfter(startDate)&& order.getDate().isBefore(endDate)){
                //jesli data jest w zakresie ma dodać do listy results
                results.add(order);
            }
        }
        return results;
    }
    //3. Metoda pobierająca zamówienia na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)
    public List<Order> getOrdersByValue (int min, int max) {
        //tworzymy pustą listę zamówień
        //nazwa listy dowolna, np: results
        List<Order> results = new ArrayList<>();
        //robimy pętlę po wszystkich zamówieniach z listy do której dodawaliśmy, czyli
        //po wszystkich zamówieniach, czyli po wszystkich obiektach typu Order
        for (Order order:orders) {
            if (order.getOrderValue() > min && order.getOrderValue() < max) {
                //jeśli wartość jest w zakresie większa od min i mniejsza od min
                //to ma dodać do listy result
                results.add(order);
            }
        }
        return results;
    }
    //4. Metoda zwracająca liczbę zamówień
    public int getSize() {
        return this.orders.size();
    }
    //5. Metoda sumująca wartość wszystkich zamówień
    //getOrder zwraca double
    public double sumOrder() {
        //najpierw trzeba utworzyć zmienną, która będzie mieć startową wartość zero
        double sum = 0;
        for (Order order : orders) {
            //do sumy dodajemy wartość zamówienia
            //przypisujemy do sumy
            sum = sum + order.getOrderValue();
        }
        return sum;
    }
}
