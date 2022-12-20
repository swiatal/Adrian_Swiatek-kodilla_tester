package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarFactoryTestSuite {
    @Test
    public void shouldPickCarOnSeason(){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //given
        Car car = (Car)context.getBean("pickCar");
        //when
        String carType = car.getCarType();
        //then
        Assertions.assertEquals("SUV", carType);
    }
   @Test
   public void shouldTurnOnHeadlightsDependsOnTime() {
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       //given
       Car car = (Car) context.getBean("pickCar");
       //when
       boolean hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn();
       LocalTime localTime = LocalTime.now();
       if (localTime.isAfter(LocalTime.of(20, 0)) && (localTime.isBefore(LocalTime.of(6, 0)))) {
           Assertions.assertTrue(hasHeadlightsTurnedOn);
       } else {
           Assertions.assertFalse(hasHeadlightsTurnedOn);
       }
   }
}
