//utworzono pakiet
package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;


//utworzono klase random
public class Random {
    //zdeklarowanie metody
    private static Shape drawShape(){

        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;


    }
    //zdeklarowanie metody
    private static Car drawCar(){

        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int a = random.nextInt() * 100 + 1;
        int b = random.nextInt() * 100 + 1;
        int c = random.nextInt() * 100 + 1;


    }

}
