package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Circle;
import com.kodilla.abstracts.homework.Shape;
import com.kodilla.abstracts.homework.equiTriangle;
import com.kodilla.abstracts.homework.Square;

public class Application {
    public static void main(String[] args) {

    Shape kolo = new Circle(3);
kolo.calcArea();
Shape triangle = new equiTriangle(4);
triangle.calcArea();
Shape square1 = new Square(3);
square1.calcArea();
    }
}
