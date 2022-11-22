package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//Klasa nie ma atrybutów, możemy zastosować metodę statyczną main
public class Application {
    public static void main(String[] args) {
// Tworzymy nowy obiekt
        //Lista nazywa się students, zadeklarowaliśmy ją jako listę obiektów klasy Student
        //przypisaliśmy do niej nową, pustą kolekcję w postaci obiektu klasy ArrayList
        List<Student> students = new ArrayList<>();
        //Wywołujemy metodę add i dodajemy nowe obiekty klasy Student, które maja przypisane lub nie obiekty Teacher
        students.add(new Student("Maciej Nowak", new Teacher("Zofia Tomczyk")));
        students.add(new Student("Katarzyna Cheba", new Teacher("Sylwester Gawron")));
        students.add(new Student("Mariusz Kos",null));
        students.add(new Student("Weronika Musiał", null));
        // Wywołujey pętle for each, aby wyświetliły się pary Student-Nauczyciel
        for (Student student : students) {
           System.out.println(student.getName()+" has Teacher " + teacherName(student));

        }
    }
    //Metoda m zwracać imie nauczyciela przypisanego danemu studentowi
   public static String teacherName (Student student) {
       //używamy metody statycznej ofNullable, ponieważ nasz obiekt jest w dwóch przypadkach nullem
       //żeby chronić się przed nullem (w tym miejscu <undefined>) muszę użyć or.Else na swoim opakowanym obiekcie teacher
       Teacher teacher = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("undefined"));
        //teraz chcę zwrócić nazwę teacher
       return teacher.getTeacherName() ;
        }
}

