package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public Circle(int a) {
        super (a);
    }

    @Override
    public void calcArea() {
        System.out.println("Pole koła wynosi" + 3.14*this.geta()*this.geta());
    }
    public void calcPerimeter() {
        System.out.println("Obwód koła wynosi" + 3.14*2*this.geta());
    }
}


