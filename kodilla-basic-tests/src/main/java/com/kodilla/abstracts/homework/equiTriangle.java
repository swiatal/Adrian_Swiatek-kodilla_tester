package com.kodilla.abstracts.homework;

public class equiTriangle extends Shape {
    public equiTriangle (int a) {
        super (a);
    }

    @Override
    public void calcArea() {
        System.out.println("Pole tójkąta równobocznego wynosi" + this.geta()*this.geta()*1.71/4);
    }
    public void calcPerimeter() {
        System.out.println("Obwód tójkąta równobocznego wynosi" + 3*this.geta());
    }
}

