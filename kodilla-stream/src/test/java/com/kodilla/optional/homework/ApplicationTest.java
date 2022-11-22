package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Klasa
public class ApplicationTest {
    //Test nr 1
   @Test
    public void testGetReturnNames(){
       Student student = new Student("Marek",new Teacher("Sebastian"));
       String name = Application.teacherName(student);
       assertEquals("Sebastian", name);
    }
    @Test
    public void testGetReturnUndefined(){
       Student student = new Student("Jacek", null);
       String name = Application.teacherName(student);
       assertEquals("undefined", name);
    }
}

