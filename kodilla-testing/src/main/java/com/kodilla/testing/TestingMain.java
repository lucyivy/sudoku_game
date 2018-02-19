package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        // testing SimpleUser
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Simple User - test OK");
        } else {
            System.out.println("Simple User - error!");
        }
        // testing Calculator
        Calculator calculator = new Calculator(5, 8);

        Integer addResult = calculator.getFirstInt() + calculator.getSecondInt();
        Integer subtractResult = calculator.getFirstInt() - calculator.getSecondInt();

        if (addResult.equals(calculator.Add())) {
            System.out.println("Method Add - test OK");
        } else {
            System.out.println("Method Add - error!");
        }

        if (subtractResult.equals(calculator.Subtract())) {
            System.out.println("Method Subtract - test OK");
        } else {
            System.out.println("Method Subtract - error!");
        }
    }
}