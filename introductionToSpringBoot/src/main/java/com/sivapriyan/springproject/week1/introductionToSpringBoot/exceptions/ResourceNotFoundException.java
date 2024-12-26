package com.sivapriyan.springproject.week1.introductionToSpringBoot.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }
}
