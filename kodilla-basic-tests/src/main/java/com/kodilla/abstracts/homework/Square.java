package com.kodilla.abstracts.homework;

public class Square extends Shape {
        public Square (int a) {
            super (a);
        }

        @Override
        public void calcArea() {
            System.out.println("Pole kwadratu wynosi" + this.geta()*this.geta());
        }
        public void calcPerimeter() {
            System.out.println("Obwód kwadratu wynosi" + 4*this.geta());
        }
    }




