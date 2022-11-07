//Utworzono pakiet

package com.kodilla.collections.arrays.homework;

//zaimportowano pakiety
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mini;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;
//Utworzono klase CarApplication
public class CarApplication {
    //Utworzono obiekt
    private static final Random RANDOM = new Random();

    //Utworzono metodę main
    public static void main(String[] args) {
        //Utworzono pusta tablice, króra przechowuje 3 elementy
        Car[] cars = new Car[3];
        //Za pomocą pętli for wywołujemy metodę drawCar tyle razy, ile elementów będzie w tablicy
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        //Dla każdego elementu w tablicy cars (dla każdego samochodu) wyświetlamy informacje o prędkości
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    //Dodajemy instrukcje warunkową
    //Utworzono metode drawCar

    //Na obiekcie klasy Rondom została wywołana metoda nextInt,
// jako argument podano maksymalną wartość, do której mają być losowane liczby
    private static Car drawCar() {
        int drawnCar = RANDOM.nextInt(3);
        //Obiekt klasy Random zwraca działaniie metody drawCar
        int a = getRandomSize();
        //Wyrażenie warunkowe
        if (drawnCar == 0)
            return new Ford(a);
        else if (drawnCar == 1)
            return new Mini(a);
        else {
            int b = getRandomSize();
            int c = getRandomSize();
            return new Opel(a, b, c);
        }
    }
    //Utworzono metodę getRandomSize
    private static double getRandomSize() {
        return RANDOM.nextInt() * 100 + 1;
    }
}
