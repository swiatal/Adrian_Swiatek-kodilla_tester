package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {
    @ParameterizedTest
    //test z danymi zawartymi w innej klasie
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#personBMIList")
    public void shouldCalculatorBMI3(double weight, double height, String expected){
        Person person =new Person(height, weight);
        assertEquals(expected, person.getBMI());
    }
}
