package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {
    static Stream<Arguments> personBMIList(){
        return Stream.of (
                //double, double, String
                Arguments.of(1.60,51,"Normal (healthy weight)"),
                Arguments.of(1.70,130, "Obese Class III (Very severely obese)"),
                Arguments.of(1.93,65, "Underweight"),
                Arguments.of(1.52,120, "Obese Class V (Super Obese)")
        );
    }
}
