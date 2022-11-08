package com.kodilla.collections.interfaces;

class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }
    public double getArea() {
       return width * width;
    }

    @Override
    public double getPerimeter() {
        return  4 * width;

    }
}
