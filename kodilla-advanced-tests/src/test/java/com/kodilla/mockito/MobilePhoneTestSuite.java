package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MobilePhoneTestSuite {
    //Tworzymy mock dla klasy MobilePhone
    //Argumentem jest typ klasy
    //Nowe! Tworzymy mocka nie używając słowa new
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        //Nie dodano żadnego zachowania, metoda zwraca wartość prymitywną false
        Assertions.assertFalse(myPhone.needsCharging());
        //Wartością domyślną jest 0.0
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        //Testujemy domyśne zachowanie
        Assertions.assertFalse(myPhone.needsCharging());
        //Nadajemy obiektowi zachowanie
        //Jeśli zostanie wywołana metoda, to powinno zwrócić wartość true
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        //Sprawdzamy, czy when().thenReturn() zadziała poprawnie
        Assertions.assertTrue(myPhone.needsCharging());
    }
    @Test
    public void shouldCallLaunchApplication() {
        //Wywołanie okreslonej metody i przekazanie argumentu
        myPhone.launchApplication("Tetris4D");
        //Sprawdzenie czy metoda została wywołana
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }
    @Test
    public void testVerificationFailure() {
        //w tym przypadku metoda get FreeStore, którą mamy sprawdzić nie została wywołana
        //Będzie bład
        myPhone.needsCharging();
    //    Mockito.verify(myPhone).getFreeStorage();
    }
}
