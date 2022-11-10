//Utowrzono pakiet
package com.kodilla.collections.interfaces;
//nie importowano pakietów, ponieważ klasy (Circle, Shape, Square, Triangle) są w tym samym pakiecie interfaces

//Utworzono klasę narzędziową (bezstanowa) o nazwie ShapeUtils, bezpośrednio po niej można wywołać metodę statyczną
public class ShapeUtils {

    //Utworzono metodę, która ma wyświetlić szczegóły danej figury (void - nic nie zwraca, argumenty to: typ Shape, nazwa shape)
    public static void displayShapeInfo(Shape shape) {

        //Użycie instrukcji sout do wyświetlenia tekstu
        System.out.println("-----------------------------");
        //getShapeName(shape) - oznacza, że wywołujemy metodę getShapName przekazując shape
        System.out.println("Shape kind: " + getShapeName(shape));
        //shape.getArea() - oznacza, że wywołujemy metodę get.Area na obiekcie typy Shape
        System.out.println("Shape area: " + shape.getArea());
        //shape.getArea() - oznacza, że wywołujemy metodę get.Perimeter na obiekcie typy Shape
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }
//Utowrzono metodę, która ma nadać nazwę kształtu figury
    private static String getShapeName(Shape shape) {

        //wyrażenie warunkowe
        //instanceof - instancja, obiekt typu, używamy go kiedy chcemy sprawdzić, czy zmiana jest danego typu
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";
    }
}

