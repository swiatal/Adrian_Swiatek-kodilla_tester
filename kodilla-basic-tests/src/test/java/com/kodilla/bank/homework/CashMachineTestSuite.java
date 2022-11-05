package com.kodilla.bank.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void shouldHaveZeroLength1() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldReturnBalance() {
        CashMachine cashMachine = new CashMachine();
       cashMachine.addTransactions(1000);
        assertEquals (0, cashMachine.getBalance());
    }
}
