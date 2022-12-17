package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {
    @ParameterizedTest
    //test z danymi zawartymi w innej klasie
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#personBMIList")
    public void shouldCalculatorBMI3(double height, double weight, String expected){
        Person person =new Person(height, weight);
        //porównywane wartości muszą być tego samego typu
        //expected zwraca double
        //person.getBMI zwraca Stringa
        assertEquals(expected, person.getBMI());
    }
}
