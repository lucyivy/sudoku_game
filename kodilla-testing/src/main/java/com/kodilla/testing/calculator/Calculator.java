package com.kodilla.testing.calculator;

public class Calculator {
    private Integer firstInt;
    private Integer secondInt;

    public Calculator (Integer firstInt, Integer secondInt){
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public Integer Add(){
        return firstInt + secondInt;
    }

    public Integer Subtract(){
        return firstInt - secondInt;
    }

    public Integer getFirstInt() {
        return firstInt;
    }

    public Integer getSecondInt() {
        return secondInt;
    }
}