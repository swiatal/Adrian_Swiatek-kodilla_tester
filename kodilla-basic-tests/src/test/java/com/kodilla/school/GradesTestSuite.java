package com.kodilla.school;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }
    public void shouldAddTwoElementsToArray(){
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int [] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }
}
