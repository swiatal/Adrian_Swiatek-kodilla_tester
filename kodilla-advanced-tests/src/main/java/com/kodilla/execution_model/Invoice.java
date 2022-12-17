package com.kodilla.execution_model;

import java.util.ArrayList;
import java.util.List;

//Klasa, która przechowuje listę pozycji w fakturze
public class Invoice {

    private List<Item> items = new ArrayList<>();

    //Metoda dodająca nową pozycję do faktury
    public void addItem(Item item) {
        this.items.add(item);
    }
//Metoda pobierająca pozycje z faktury, jeśli przekazany indeks jest zgodny
    public Item getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return this.items.get(index);
        }
        return null;
    }
//Metoda usuwająca wszystkie pozycje z faktury
    public void clear() {
        this.items.clear();
    }
//Metoda zwracająca liczby pozycji w fakturze
    public int getSize() {
        return this.items.size();
    }
}
