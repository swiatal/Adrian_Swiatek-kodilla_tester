package com.kodilla.bank.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void balans() {
        CashMachine cashMachinery = new CashMachine();
        CashMachine cashMachinery2 = new CashMachine();
        cashMachinery.add(5);
        cashMachinery2.add(-4);
        cashMachinery2.add(8);
        cashMachinery2.add(-15);
        Bank bank = new Bank();
        bank.addCashMachine(cashMachinery2);
        bank.addCashMachine(cashMachinery);
        int result = bank.balans();
        assertEquals(-6, result);
    }

    @Test
    public void shouldCalculatePayoutTransactions() {
        CashMachine cashMachinery = new CashMachine();
        CashMachine cashMachinery2 = new CashMachine();
        cashMachinery.add(5);
        cashMachinery2.add(-4);
        cashMachinery2.add(8);
        cashMachinery2.add(-15);
        Bank bank = new Bank();
        bank.addCashMachine(cashMachinery2);
        bank.addCashMachine(cashMachinery);
        int result = bank.numberOfPayoutTransactions();
        assertEquals(2, result);
    }

    @Test
    public void shouldCalculatePayInTransactions() {
        CashMachine cashMachinery = new CashMachine();
        CashMachine cashMachinery2 = new CashMachine();
        cashMachinery.add(5);
        cashMachinery2.add(-4);
        cashMachinery2.add(8);
        cashMachinery2.add(-15);
        Bank bank = new Bank();
        bank.addCashMachine(cashMachinery2);
        bank.addCashMachine(cashMachinery);
        int result = bank.numberOfPayInTransactions();
        assertEquals(2, result);
    }

    @Test
    public void shouldCalculateAverageOfPayout() {
        CashMachine cashMachinery = new CashMachine();
        CashMachine cashMachinery2 = new CashMachine();
        cashMachinery.add(5);
        cashMachinery2.add(-4);
        cashMachinery2.add(8);
        cashMachinery2.add(-15);
        Bank bank = new Bank();
        bank.addCashMachine(cashMachinery2);
        bank.addCashMachine(cashMachinery);
        double result = bank.averageOfPayOut();
        assertEquals(-9.0, result);
    }

    @Test
    public void shouldCalculateAverageOfPayIn() {
        CashMachine cashMachinery = new CashMachine();
        CashMachine cashMachinery2 = new CashMachine();
        cashMachinery.add(5);
        cashMachinery2.add(-4);
        cashMachinery2.add(8);
        cashMachinery2.add(-15);
        Bank bank = new Bank();
        bank.addCashMachine(cashMachinery2);
        bank.addCashMachine(cashMachinery);
        double result = bank.averageOfPayIn();
        assertEquals(6.0, result);
    }
}
