package com.kodilla.bank.homework;

public class Bank {
   private CashMachine [] values;
    private int size = 0;
    public int balans() {
        int suma = 0;
        for (int i = 0; i<this.size; i++){
            suma = suma + this.values[i].getSaldo();
        }

        return suma;
    }

    public void addCashMachine(CashMachine cashMachine) {
      this.size = this.size++;
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = cashMachine;
        this.values = newTab;
    }

    public int numberOfPayoutTransactions() {
        return 0;
    }

    public int numberOfPayInTransactions() {
        return 0;
    }
    public double averageOfPayOut() {
        return 0;
    }
    public double averageOfPayIn() {
        return 0;
    }
}
