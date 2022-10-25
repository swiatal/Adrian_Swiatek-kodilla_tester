package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;

    public Shape(int a){
    this.a = a;
    }
        public int geta (){
    return a;
    }
    public abstract void calcArea ();
    public abstract void calcPerimeter ();
}
