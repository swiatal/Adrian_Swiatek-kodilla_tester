package com.kodilla.parametrized_tests;

public class StringManipulator {
    //Cel metody: zwrócić wynik oczekiwany
    //ma odwrócić ciąg słów w wyrazie na małe litery
    //Test nie jest przygotowany na to, że może być przekazany do niego null
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }
    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
    //public int countNumberOfCommas(String text) {
        //int count = text.length() - text.replace(",", "").length();
        //return count;
    //}
}
//Jakie przypadki testowe:
// powinien odwrócić ciąg słów na małe itery
// w wartościach źródłowych dajemy przykłady
