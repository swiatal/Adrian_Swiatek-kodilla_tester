package com.kodilla.jacoco;

import com.kodilla.jacoco.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleBy4() {

        //given
        Year year = new Year(1601);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}
