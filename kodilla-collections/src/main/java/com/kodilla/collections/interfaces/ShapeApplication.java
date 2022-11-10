//Utworzono pakiet
package com.kodilla.collections.interfaces;

//zaimportowano pakiet, który będzie używał program. Deklaracja imporotwa musi byc po zestawieniu pakietów przed deklaracją klasy
import com.kodilla.collections.interfaces.*;
import java.util.Random;

//Utworzono klasę o nazwie ShapeApplication
//Zadanie tej klasy, to wylosowanie różnych figur (o losowych wymiarach0 i wstawienie ich do tablicy
public class ShapeApplication {

    //Utworzono obiekt (private - zmienna jest prywatna, statyczna - nie potrzeba obiektu, żeby ja pobrać, final - nie mozna przypisać do referencji nowego obiektu)
    //Nazwa obiektu jest wielkimi literami (choć nie musi), ponieważ jesli coś jest static final, to oznacza, że jest stałe
    private static final Random RANDOM = new Random();

    //Utworzono metodę main
    public static void main(String[] args) {

        //Obiekt - utworzono pusta tablice, króra przechowuje 5 elementy
        Shape[] shapes = new Shape[5];

        //Za pomocą pętli for wywołano metodę drawShape tyle razy, ile elementów będzie w tablicy
        //tworzymy petle for z indeksem n, która zaczyna się od 0, pętla ma się wykonywać tak długo dopóki nbędzie mniejsze od rozmiaru tablicy Shapes, po każdej iteracji będziemy zwiąkszać n o 1
        for (int n = 0; n < shapes.length; n++)

            //Do tablicy o nazwie shapes, do komórki o indeksie n - przypisujemy wynik działania metody drawShape
            shapes[n] = drawShape();

        //Dla każdego elementu w tablicy shape (dla każdego kształtu) wyświetlamy informacje o wymiarach
        //Pętla for, która idzie po wszystkich elementach z tablicy shapes, za każdym razem pobiera obiekt i przypisuje go do zmiennej shape
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }
    //Dodajemy instrukcje warunkową
    //Utworzono metode drawShape, słowo Shape informuje nas, że metoda będzie zwracać obiekt typu Shape
    private static Shape drawShape() {

//Na obiekcie klasy Rondom została wywołana metoda nextInt,
// Jako argument podano maksymalną wartość, do której mają być losowane liczby
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

