package com.kodilla.parametrized_tests;

//Klasa sprawdzająca liczby
public class NumberChecker {
    //Cel metody: zwrócić true (mamy typ boolean)
                //jesli liczba jest podzielna przez 3
    //Test nie jest przygotowany na to, że może być przekazany do niego null
    public boolean isDivisibleByThree(int number)
    {
        return number % 3 == 0;
    }
}
   //Jakie przypadki testowe:
     // liczba 3 - true
     // wielokrotność liczby 3 - true
     // liczba ujemna będąca wielokrotnością liczby 3 - true
     // liczba 0 - true
     // liczba niepodzielna przez 3 - false