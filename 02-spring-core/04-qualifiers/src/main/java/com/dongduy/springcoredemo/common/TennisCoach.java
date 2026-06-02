package com.dongduy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements  Coach {

    @Override
    public String getDailyWorkout() {
        return "do 100 tennis exercises";
    }
}
