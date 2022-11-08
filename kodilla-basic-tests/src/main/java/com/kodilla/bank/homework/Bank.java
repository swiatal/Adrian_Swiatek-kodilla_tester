package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] values;
    private int size = 0;

    public Bank() {
        this.size = 0;
        this.values = new CashMachine[0];
    }

    public int balans() {
        int suma = 0;
        for (int i = 0; i < this.size; i++) {
            suma = suma + this.values[i].getSaldo();
        }
System.out.println(suma);
        return suma;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = cashMachine;
        this.values = newTab;
    }

    public int numberOfPayoutTransactions() {
        int ile = 0;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.values[i].getSize(); j++) {
                if (this.values[i].getTransactions()[j] < 0) ile = ile + 1;
            }
        }
        return ile;
    }

    public int numberOfPayInTransactions() {
        int ile = 0;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.values[i].getSize(); j++) {
                if (this.values[i].getTransactions()[j] > 0) ile = ile + 1;
            }
        }
        return ile;
    }

    public double averageOfPayOut() {
        int ile = 0;
        int suma = 0;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.values[i].getSize(); j++) {
                if (this.values[i].getTransactions()[j] < 0) {
                    ile = ile + 1;
                    suma = suma + this.values[i].getTransactions()[j];
                }
            }
        }
        return suma / ile;
    }

    public double averageOfPayIn() {
        int ile = 0;
        int suma = 0;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.values[i].getSize(); j++) {
                if (this.values[i].getTransactions()[j] > 0) {
                    ile = ile + 1;
                    suma = suma + this.values[i].getTransactions()[j];
                }
            }
        }
        return suma / ile;
    }
}




