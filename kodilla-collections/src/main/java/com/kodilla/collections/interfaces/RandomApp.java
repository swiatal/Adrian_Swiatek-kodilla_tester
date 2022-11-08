//utworzono pakiet
package com.kodilla.collections.interfaces;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;


//utworzono klase random
public class RandomApp {
    //zdeklarowanie metody
    private static Shape drawShape(){

        Random random= new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;

        if (drawnShapeKind == 1){
        return new Circle(5);}
else if (drawnShapeKind == 0){
    return new Square(b);
        }
else {
    return new Triangle(a, b, c);
        }
    }
}
