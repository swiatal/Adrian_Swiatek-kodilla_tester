package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
@SpringBootTest
public class ClockTest {
    @Test
    public void shouldNotSameTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        //when
        LocalTime firstTime = firstBean.getTime();
        LocalTime secondTime = secondBean.getTime();
        LocalTime thirdTime = thirdBean.getTime();

        //then
        Assertions.assertNotEquals(firstTime, secondTime);
        Assertions.assertNotEquals(secondTime, thirdTime);
        Assertions.assertNotEquals(firstTime, thirdTime);
    }
}