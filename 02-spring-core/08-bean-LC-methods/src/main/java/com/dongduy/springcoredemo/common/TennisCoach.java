package com.dongduy.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class TennisCoach implements  Coach {

    public TennisCoach () {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public void init() {
        System.out.println("In postConstruct: " + getClass().getSimpleName());
    }
    @PreDestroy
    public void destroy() {
        System.out.println("In preDestroy: " + getClass().getSimpleName());
    }
    //define destroy method

    @Override
    public String getDailyWorkout() {
        return "do 100 tennis exercises";
    }
}
