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
        Car car = (Car)context.getBean("pickCar","summer");
        //when
        String carType = car.getCarType();
        //then
        Assertions.assertEquals("Cabrio", carType);

        //given
        car = (Car)context.getBean("pickCar","winter");
        //when
        carType = car.getCarType();
        //then
        Assertions.assertEquals("SUV", carType);

        //given
        car = (Car)context.getBean("pickCar","autumn");
        //when
        carType = car.getCarType();
        //then
        Assertions.assertEquals("Sedan", carType);

        //given
        car = (Car)context.getBean("pickCar","spring");
        //when
        carType = car.getCarType();
        //then
        Assertions.assertEquals("Sedan", carType);
    }
   @Test
   public void shouldTurnOnHeadlightsDependsOnTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //given
       Car car = (Car)context.getBean("pickCar","summer");
       //when
       boolean hasHeadlightsTurnedOn= car.hasHeadlightsTurnedOn(LocalTime.of(22,15));
       //then
       Assertions.assertTrue(hasHeadlightsTurnedOn);
       //given
       Car car1 = (Car) context.getBean("pickCar","winter");
       //when
       boolean hasHeadlightsTurnedOn1  = car.hasHeadlightsTurnedOn(LocalTime.of(14,20));
       //then
       Assertions.assertFalse(hasHeadlightsTurnedOn1);
   }
}
