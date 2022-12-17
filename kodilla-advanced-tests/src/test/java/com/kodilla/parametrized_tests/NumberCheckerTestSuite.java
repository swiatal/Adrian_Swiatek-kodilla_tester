package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTestSuite {
    //given
    private NumberChecker numberChecker = new NumberChecker();

    //test parametryzowany - przekazujemy zestaw danych do wartości tekstowej
    //warunek; dane stanowią spójną część przypadków testowych
    // test ten uruchomi się tyle razy ile argumentów zostało przekazne do wartości źródłowej
    @ParameterizedTest
    //@ValueSource - to test z niewielkim zbiorem danych wejściowych
    //Może przyjmować jeden rodzaj argumentów
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    //when
    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    //when
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        //then
        assertFalse(result);
    }

}
