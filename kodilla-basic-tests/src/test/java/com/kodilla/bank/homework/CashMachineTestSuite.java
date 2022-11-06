package com.kodilla.bank.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CashMachineTestSuite {

    @Test
    public void getSaldoTest() {
        CashMachine cashMachine = new CashMachine();
    cashMachine.add(600);
    cashMachine.add(-300);
        assertEquals(300, cashMachine.getSaldo());
    }
    @Test
    public void getCount() {
        CashMachine cashMachine = new CashMachine();
       cashMachine.add(50);
       cashMachine.add(-30);
        assertEquals(2, cashMachine.getCount());
    }
}
