package com.dongduy.springcoredemo.common;

import org.springframework.stereotype.Component;

//@Primary
@Component
public class TennisCoach implements  Coach {

    public TennisCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "do 100 tennis exercises";
    }
}
