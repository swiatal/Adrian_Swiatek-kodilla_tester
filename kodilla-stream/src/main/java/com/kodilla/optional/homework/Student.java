package com.kodilla.optional.homework;
import java.util.Objects;
//Klasa Teacher
public class Student {
    //Klasa ma dwa pola
private String name;
private Teacher teacher;
    //Konstruktor inicjuje to pole
    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    // Metoda pozwalająca odczytać prywatne pola(atrybuty)
    public String getName() {
        return name;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    //Nadpisanie metody equals (służy do porównania obiektów, zwróci wartości true, gdy oba obiekty są takie same)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(teacher, student.teacher);
    }
    //Nadpisanie metody hashCode - generuje sie automatycznie, sprawdza jaką wartość ma obiekt
    @Override
    public int hashCode() {
        return Objects.hash(name, teacher);
    }
}
