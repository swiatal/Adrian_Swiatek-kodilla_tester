package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private double number;

    public static double getPi() {
        return Math.PI;
    }

    public double getName() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadCodeExample that = (BadCodeExample) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
