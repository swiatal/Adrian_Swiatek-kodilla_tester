//Utworzono pakiet
package com.kodilla.collections.arrays.homework;

//zaimportowano pakiety, które będzie używał program. Deklaracja importowa musi być po zestawieniu pakietu przed deklaracja klasy
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mini;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

//Utworzono klasę, która posiada metodę wyświetlającą szczegóły dowolnego auta.
public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        car.getIncreaseSpeed();
        System.out.println("getSpeed: " + car.getSpeed());
    }
//Utworzono metodę, która ma wyświetlić informacje o modelu auta.
    public static String getCarName(Car car) {
        //wyrażenie warunkowe
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Mini)
            return "Mini";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }
}
