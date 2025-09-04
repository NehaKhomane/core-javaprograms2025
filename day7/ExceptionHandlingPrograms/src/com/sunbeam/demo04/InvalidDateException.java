package com.sunbeam.demo04;
//unchecked
public class InvalidDateException extends RuntimeException {
    //parameterless constructor
    public InvalidDateException() {
    }

    //parameterized constructor
    public InvalidDateException(String message) {
        super(message);
    }
}
