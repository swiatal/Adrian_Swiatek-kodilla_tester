package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources ="/numbersGamblingMachine.csv" , numLinesToSkip = 1)
    public void  shouldThrowExceptionIfInvalidNumbers (String input) {
        //given
        Set<Integer> numbers = convert (input);
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(numbers));

    }
    public Set<Integer> convert(String input) {
        Set<Integer> numbers = new HashSet<>();
        String[] elements = input.split(",");
        for (String element : elements) {
            int number = Integer.parseInt(element);
            numbers.add(number);
        }
        return numbers;
    }
}
