package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

public class ClockTest {
    private ApplicationContext context;

    @BeforeEach
    public void setUpContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }
    @Test
    public void shouldNotSameTime() {
        Clock clock = context.getBean(Clock.class);
        clock.updateTime();
        Clock secondClock = context.getBean(Clock.class);
        secondClock.updateTime();

        Assertions.assertNotEquals(clock.getLocalTime(),secondClock.getLocalTime());
    }
}