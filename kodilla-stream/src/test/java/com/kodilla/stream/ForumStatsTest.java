package com.kodilla.stream;

import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    @Test
 public void testAverageOver40(){
        Double average = ForumStats.getAverageNumberHigher40();
        assertEquals(2.25, average);


}
@Test
    public void testAverageUnder40(){
        Double average = ForumStats.getAverageNumberLower40();
        assertEquals(2382, average);
}
}
