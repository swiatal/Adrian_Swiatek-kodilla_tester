//Utowrzono pakiet
package com.kodilla.collections.interfaces;
//zaimporotwano pakiety, które będzie używał program. Deklaracja imporotwa musi byc po zestawieniu pakietów przed deklaracją klasy

//Utworzono klasę narzędziową, która posiada metodę wyświetlającą szczegóły dowolnej figury.
public class ShapeUtils {

    //Utworzono metodę, która ma wyświetlić informacje o kształcie figury.
    public static void displayShapeInfo(Shape shape) {
        //Użycie instrukcji sout do wyświetlenia tekstu
        System.out.println("-----------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }
//Utowrzono metodę która ma nadać nazwę kształtu figury
    private static String getShapeName(Shape shape) {
        //wyrażenie warunkowe
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

