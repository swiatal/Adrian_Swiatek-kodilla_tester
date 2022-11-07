//Utworzono pakiet
package com.kodilla.collections.arrays;
//zaimportowano pakiety
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;
//Utworzono klase ShapeApplication
public class ShapeApplication {
   //Utworzono obiekt
    private static final Random RANDOM = new Random();

    //Utworzono metodę main
    public static void main(String[] args) {
        //Utworzono pusta tablice, króra przechowuje 5 elementy
        Shape[] shapes = new Shape[5];
        //Za pomocą pętli for wywołujemy metodę drawShape tyle razy, ile elementów będzie w tablicy
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        //Dla każdego elementu w tablicy shape (dla każdego kształtu) wyświetlamy informacje o wymiarach
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }
    //Dodajemy instrukcje warunkową
    //Utworzono metode Shape
    private static Shape drawShape() {
//Na obiekcie klasy Rondom została wywołana metoda nextInt,
// jako argument podano maksymalną wartość, do której mają być losowane liczby
        int drawnShapeKind = RANDOM.nextInt(3);
        //Obiekt klasy Random zwraca działaniie metody drawShape
        double a = getRandomSize();
        //Wyrażenie warunkowe
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize();
            double c = getRandomSize();
            return new Triangle(a, b, c);
        }
    }
//Utworzono metodę getRandomSize
    private static double getRandomSize() {
        return RANDOM.nextDouble() * 100 + 1;
    }
}

