package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {
    //Cel metody: zwrócić liczbę wylosowaną przez użytkownika
    //jeśli liczba jest błędnego rozmiaru lub nie jest ona z zadeklarowanego przedziału ma wyrzucać wyjątek
    //liczba powinna być z przedziału 1-49
    //ma zwracać liczby w rozmiarze (ilości ) różnej od 6

    //W pierwszej kolejności trzeba sprawdzić ile jest metod publicznych, a ile prywatnych
    //Jest tylko jedna metoda publiczna, ale ona wywołuje wszystkie prywatne
    //W testach trzeba zwrócić uwagę na to gdzie są if

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
//Jakie przypadki testowe:
// powinien wyrzucać wyjątek jeśli rozmiar (ilość) jest > 6
// powinien wyrzucać wyjątek jeśli rozmiar (ilość) jest < 6
// powinien wyrzucać wyjątek jeśli którakolwiek z liczb poza zakresem
// powinien wyrzucać wyjątek jeśli którakolwiek z liczb jest w zadeklarowanym zakresie, ale
//jest <1 lub >49