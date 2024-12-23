package com.sivapriyan.springproject.week1.introductionToSpringBoot;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    void eatApple(){
        System.out.println("I am eating the apple");
    }

    @PostConstruct
    void callBeforeAppleisUsed(){
        System.out.println("before creating apple");
    }

}
