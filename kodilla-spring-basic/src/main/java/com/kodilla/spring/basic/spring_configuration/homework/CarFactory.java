package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class CarFactory {
@Bean
    /*@Scope("prototype")*/
    public Car pickCar(){
        Car car;
    LocalDate localDate= LocalDate.now();
    /*switch (localDate.getMonthValue()){
        case 1:
        case 2:
        case 12:
            return new SUV();
        case 6:
        case 7:
        case 8:
            return new Cabrio();
        default:
            return new Sedan();
    }*/
    if (localDate.getMonthValue() == 12  || localDate.getMonthValue() == 1  || localDate.getMonthValue() == 2){
        car = new SUV();
    } else if (localDate.getMonthValue() == 6  || localDate.getMonthValue() == 7  || localDate.getMonthValue() == 8) {
        car = new Cabrio();
    } else {
        car = new Sedan();
    } return car;
}
}



