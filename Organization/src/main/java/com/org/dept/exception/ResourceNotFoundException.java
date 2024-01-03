package com.org.dept.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.annotation.HttpConstraint;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(){

        super("Resource Not Found On Server !!");
    }

    public ResourceNotFoundException(String message){

        super(message);
    }
}
