package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main (String [] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Maciej Nowak", new Teacher("Zofia Tomczyk")));
        students.add(new Student("Katarzyna Cheba", new Teacher("Sylwester Gawron")));
        students.add(new Student("Mariusz Kos", new Teacher("null")));
        students.add(new Student("Weronika Musiał", new Teacher("null")));

        for (Student student : students){

            Teacher teacher = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("undefined"));
            Optional<Teacher> optionalStudent = Optional.ofNullable(student.teacher);
            optionalStudent.ifPresent(u-> System.out.println("Student:" + u.getName() + "Teacher:" + u.getName()));
        }
    }
}
