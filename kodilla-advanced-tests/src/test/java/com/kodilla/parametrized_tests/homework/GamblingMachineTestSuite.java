package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    //Pobrany zewnętrzny plik csv
    @CsvFileSource(resources ="/numbersGamblingMachine.csv" , numLinesToSkip = 1)
    public void  shouldThrowExceptionIfInvalidNumbers (String input) {
        //given
        Set<Integer> numbers = convert (input);
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(numbers));

    }
    //Celem tej metody jest zamiana Stringa na Set liczb
    public Set<Integer> convert(String input) {
        Set<Integer> numbers = new HashSet<>();
        //Rozdziela elementy za pomocą przecinka, za przecinkiem będzie kolejna liczba
        String[] elements = input.split(",");
        //idzie po pętli, po elementach z tablicy
        for (String element : elements) {
            //zamienia na inta
            int number = Integer.parseInt(element);
            //dodaje do Set
            numbers.add(number);
        }
        return numbers;
    }
}
