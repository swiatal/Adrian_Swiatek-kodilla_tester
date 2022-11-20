package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void testGetReturnNames(){
     //when
        List<Student> result = Application.main();
        //then
        List<Student> names = new ArrayList<>();
        List<Teacher> names1 = new ArrayList<>();
        names.add(new Student("Maciej Nowak", new Teacher("Zofia Tomczyk")));
        assertEquals(names, result);
        assertEquals(2, result.size());
    }

}

