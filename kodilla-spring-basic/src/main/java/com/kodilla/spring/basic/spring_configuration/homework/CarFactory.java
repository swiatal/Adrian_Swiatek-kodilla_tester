package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CarFactory {
    private List<Car> cars = new ArrayList<>();
@Bean
    @Scope("prototype")
    public Car pickCar(String season){
    switch (season){
        case "summer":
            return new Cabrio();
        case "winter":
            return new SUV();
        default:
            return new Sedan();
    }
}

    }

