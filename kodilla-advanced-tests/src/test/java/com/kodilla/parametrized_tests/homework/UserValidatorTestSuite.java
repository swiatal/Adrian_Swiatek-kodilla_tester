package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    //given
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Rafal","Marcin14"}  )

    public void shouldPassValidName(String username){
        //when
        boolean result = userValidator.validateUsername(username);
        //then
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"wq","+12","kasia,1"}  )
    public void shouldPassInvalidUsername(String username){
        //when
        boolean result = userValidator.validateUsername(username);
        //then
        assertFalse(result);
    }
    @ParameterizedTest
    @CsvSource(value = {"example@example.com","123example@wp.pl",})
    public void shouldReturnTrueProperlyRecognizeEmail(String email){
        //when
        boolean result = userValidator.validateEmail(email);
        //then
        assertTrue(result);
    }
    @ParameterizedTest
    @CsvSource(value = {"example.com","example@.com",})
    public void shouldReturnFalseProperlyRecognizeEmail(String email){
        //when
        boolean result = userValidator.validateEmail(email);
        //then
        assertFalse(result);
    }
}


