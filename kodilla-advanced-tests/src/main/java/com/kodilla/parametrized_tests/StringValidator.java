package com.kodilla.parametrized_tests;

public class StringValidator {
    //Cel metody: zwrócić true (mamy typ boolean)
    //jesli zwrócony tekst jest równy null lub gdy tekst pozbawiony spacji jest pusty
    //Test nie jest przygotowany na to, że może być przekazany do niego null
        public boolean isBlank(String text) {
            return text == null || text.trim().isEmpty();
        }
    }
//Jakie przypadki testowe:
// wartość (tekst) jest pusty - true
// wartość (tekst) nie jest pusty - false
// wartość (tekst) ma spacje - true
// wartość (tekst) jest null - true

