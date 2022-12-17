package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    //Cel metody: zwrócić true
    //jeśli nazwa użytkownika pasuje
    //do weryfikacji poprawności nazwy użyto regexa
    //Test nie jest przygotowany na to, że może być przekazany do niego null
    public boolean validateUsername(String username) {
    return username.matches("^[a-zA-Z0-9._-]{3,}$");
}
    //Cel metody: zwrócić true
    //jeśli nazwa emaila jest zgodna ze wzorem (schematem)
    //do weryfikacji poprawności nazwy użyto regexa
    //Test nie jest przygotowany na to, że może być przekazany do niego null
public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}
//Jakie przypadki testowe:
// powinien podać prawidłową nazwę użytkownika - true
// powinien podać nie prawidłową nazwę użytkownika - false
// powinien podać prawidłowy wzór emaila - true
// powinien podać nie prawidłowy wzór emaila - false
