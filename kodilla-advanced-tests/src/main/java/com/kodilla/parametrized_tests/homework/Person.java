package com.kodilla.parametrized_tests.homework;

public class Person {

    private double heightInMeters;
    private double weightInKilogram;
    //Cel metody: zwrócić takiego Stringa jaki jest przyjęty dla danego poziomu bmi
    //Test nie jest przygotowany na to, że może być przekazany do niego null
    public Person(double heightInMeters, double weightInKilogram) {
        this.heightInMeters = heightInMeters;
        this.weightInKilogram = weightInKilogram;
    }
    //Metoda z osobną klasą przygotowującą dane testowe
    public String getBMI() {
        double bmi = weightInKilogram / (heightInMeters * heightInMeters);
        //jeslli bmi jest takie to zwraca takiego Stringa itd
        if (bmi < 15) {
            return "Very severely underweight";
        } else if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal (healthy weight)";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obese Class I (Moderately obese)";
        } else if (bmi < 40) {
            return "Obese Class II (Severely obese)";
        } else if (bmi < 45) {
            return "Obese Class III (Very severely obese)";
        } else if (bmi < 50) {
            return "Obese Class IV (Morbidly Obese)";
        } else if (bmi < 60) {
            return "Obese Class V (Super Obese)";
        }
        return "Obese Class VI (Hyper Obese)";
    }
}
//Jakie przypadki testowe:
//oblicza wartość bmi na podstawie danych testowych z odrębnej klasy
//zwraca wartość oczekiwaną