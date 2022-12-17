package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringManipulatorTestSuite {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    //@Csv używamy wtedy, gdy mamy bardzo dużo danych do testowania
    //używamy wtedy, gdy chcemy, by argumentów było więcej
    //adnotacja ta przyjmuje tablice, każdy z pojedynczych elementów jest rozdzielony przecinkiem
    //pierwsza to wartość testowa, druga to oczekiwany wynik
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    //@ParameterizedTest
    //@CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    //public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        //assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    //}

    //@ParameterizedTest
    //@MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    //public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        //assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    //}

    //Metoda poniżej dostarczy oczekiwany obiekt
    //value wskazuje nazwę metody tworzącej dane testowe
    //Metoda "provideStringsForTestingLength" zwraca Stream argumentów
    @ParameterizedTest
    @MethodSource  (value = "provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }
    //Dodajemy metodę statyczną, która przygotowuje dane tekstowe
    //Importujemy klasę Arguments
    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }

    //@ParameterizedTest
    //@CsvFileSource(resources = "/numberOfComas.csv", numLinesToSkip = 1)
    //public void shouldCountNumberOfCommas(String input, int expected) {
        //assertEquals(expected, manipulator.countNumberOfCommas(input));
    //}
}

