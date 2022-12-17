package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarFactoryTest {
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
        Car car1 = (Car)context.getBean("pickCar","winter");
        //when
        String carType1 = car.getCarType();
        //then
        Assertions.assertEquals("SUV", carType);

        //given
        Car car2 = (Car)context.getBean("pickCar","autumn");
        //when
        String carType2 = car.getCarType();
        //then
        Assertions.assertEquals("Sedan", carType);

        //given
        Car car3 = (Car)context.getBean("pickCar","spring");
        //when
        String carType3 = car.getCarType();
        //then
        Assertions.assertEquals("Sedan", carType);
    }
   @Test
   public void shouldTurnOnHeadlightsDependsOnTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //given
       Car car = (Car)context.getBean("pickCar","summer");
       //when
       boolean hashHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(22,15));
       //then
       Assertions.assertTrue(hashHeadlightsTurnedOn);
       //given
       Car car1 = (Car) context.getBean("pickCar","winter");
       //when
       boolean hashHeadlightsTurnedOn1  = car.hasHeadlightsTurnedOn(LocalTime.of(14,20));
       //then
       Assertions.assertFalse(hashHeadlightsTurnedOn1);
   }
}
