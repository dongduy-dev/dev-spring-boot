package com.dongduy.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Lazy
@Component
public class CricketCoach implements Coach {

    public CricketCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice cricket";
    }
}
