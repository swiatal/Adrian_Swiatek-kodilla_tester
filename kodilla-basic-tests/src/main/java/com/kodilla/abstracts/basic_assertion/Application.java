package com.kodilla.abstracts.basic_assertion;

//import static org.junit.jupiter.api.Assertions.assertEquals;


public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = a + b;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.subtract(a, b);
        double powerResult = calculator.power(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        boolean correct2 = ResultChecker.assertEquals(-3, subResult);
        //boolean correct3 = ResultChecker.assertEquals(8, powerResult, 0.001);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb" + a + "i" + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb" + a + "i" + b);
        }
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb" + a + "i" + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb" + a + "i" + b);
        }

        Calculator calculator1 = new Calculator();



        }
    }


