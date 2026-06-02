package com.dongduy.springcoredemo.config;

import com.dongduy.springcoredemo.common.Coach;
import com.dongduy.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

//    @Bean
//    public Coach swimahCoach() {
//        return new SwimCoach();
//    }

    //custom bean id instead of using class name
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
