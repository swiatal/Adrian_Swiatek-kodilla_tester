package com.kodilla.optional.homework;
import java.util.Objects;
//Klasa Teacher
public class Teacher {
    //Klasa ma jedno pole
    private String name;
//Konstruktor inicjuje to pole
    public Teacher(String name) {
        this.name = name;
    }
// Metoda pozwalająca odczytać prywatne pola(atrybuty)
    public String getTeacherName() {
        return name;
    }
//Nadpisanie metody equals (służy do porównania obiektów, zwróci wartości true, gdy oba obiekty są takie same)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }
    //Nadpisanie metody hashCode - generuje sie automatycznie, sprawdza jaką wartość ma obiekt
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

