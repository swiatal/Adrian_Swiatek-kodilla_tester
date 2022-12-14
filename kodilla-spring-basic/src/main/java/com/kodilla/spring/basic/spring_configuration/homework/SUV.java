package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

  @Override
  public boolean hasHeadlightsTurnedOn(){
    LocalTime time = LocalTime.now();
    /*return time.compareTo(LocalTime.of(20,0))>0 || time.compareTo(LocalTime.of(6,0))<0;
  }
*/
    if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(20, 0))) {
      return false;
    }
    return false;
  }
    @Override
    public String getCarType() {
    return "SUV";
}
}