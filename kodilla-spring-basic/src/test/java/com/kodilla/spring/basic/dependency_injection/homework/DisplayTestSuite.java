package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
//Adnotacja uruchamia Springowy kontekst na czas działania testów
@SpringBootTest
public class DisplayTestSuite {
    double a = 15;
    double b = 3;

    @Test
    public void shouldReturnCorrectAddValue() {
        //Pobierany jest kontekst Springowy
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        //Kontekst jest przypisany do zmiennej, więc korzystamy z metody getBean
        //Szuka ona beana określonego typu
        Calculator calculator = context.getBean(Calculator.class);
        //Sposób wywołania metody jest taki jak dotychczas
        double addResult = calculator.add(a,b);
        assertEquals(18, addResult, 0.1);
    }
    @Test
    public void shouldReturnSubtractValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        double subtractResult = calculator.subtract(a,b);
        assertEquals(12,subtractResult,0.1);
    }
    @Test
    public void shouldReturnMultiplyValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        double multiplyResult = calculator.multiply(a,b);
        assertEquals(45, multiplyResult, 0.1);
    }
    @Test
    public void shouldReturnDivideValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator =context.getBean(Calculator.class);
        double divideResult = calculator.divide(a,b);
        assertEquals(5,divideResult,0.1);
    }
}
