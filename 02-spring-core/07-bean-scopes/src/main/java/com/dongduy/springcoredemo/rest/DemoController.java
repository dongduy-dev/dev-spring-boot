package com.dongduy.springcoredemo.rest;

import com.dongduy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

     // define a private  field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("tennisCoach") Coach myCoach,
            @Qualifier("tennisCoach") Coach anotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }
//    public DemoController(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check-bean-scopes")
    public String checkBeanScopes() {
        return "check bean scopes: " + (myCoach == anotherCoach);
    }
}
