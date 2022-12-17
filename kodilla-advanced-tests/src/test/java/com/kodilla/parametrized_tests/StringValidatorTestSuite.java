package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }

    //@Test
    //public void shouldReturnTrueIfStringIsEmpty() {
        //assertTrue(validator.isBlank(""));
    // }
    //@Test
    //public void shouldReturnTrueIfStringHasOnlySpaces() {
        //assertTrue(validator.isBlank("   "));
    // }
    //@ParameterizedTest
    //@ValueSource(strings = {"", "   "})
    //public void shouldReturnTrueIfStringIsEmpty(String text) {
        //assertTrue(validator.isBlank(text));
    //}

    //@Test
    //public void shouldReturnTrueIfStringIsNull() {
        //assertTrue(validator.isBlank(null));
    //}

    //@ParameterizedTest
    //@NullSource
    //public void shouldReturnTrueIfStringIsNull(String text) {
        //assertTrue(validator.isBlank(text));
    //}
    //Natomiast zamiast "pustego" Stringa (często spotykana nazwa dla cudzysłowów bez znaków pomiędzy – "")
    //możemy użyć adnotacji @EmptySource:
    //@ParameterizedTest
    //@EmptySource
    //public void shouldReturnTrueIfStringIsEmpty(String text) {
        //assertTrue(validator.isBlank(text));
    //}
    //Dwie powyższe adnotacje możemy też połączyć w jedną – @NullAndEmptySource:
    //@ParameterizedTest
    //@NullAndEmptySource
    //public void shouldReturnTrueIfStringIsEmpty(String text) {
        //assertTrue(validator.isBlank(text));
    //}
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));

    }
}
