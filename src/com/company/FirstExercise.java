package com.company;

public class FirstExercise {
    public static void main(String[] args) {
        // Task 15 mins
        // Declare long, double variables and perform the above arithmetic operations on them.

        // long firstLong;
        // long secondLong;

        // double firstDouble;
        // double secondDouble;


        // Task: 15 mins
        // You have 2 variables:
         long number1 = 230;
         long number2 = 430;

        // Using these numbers create 2 boolean expressions
        // representing a ball and a torch
        // You are sent to get either of these items, and can find
        // either one of them
        // return an equivalent response telling the
        // person that sent you on the errand which item you got or if
        // you don't get all the items
        // return an appropriate response as well.

        boolean ball = number1 > number2; // false
        boolean torch = number1 == number2; // false
        boolean water = number1 <= number2; // true
        boolean cocacola = number1 >= number2; // false
        boolean beer = number2 != number1; // true

        if (ball) {
            System.out.println("We found ball");
        } else if (torch) {
            System.out.println("We found torch");
        } else {
            System.out.println("We couldn't find any of the items");
        }

        // 15 mins
        // Using the boolean expressions above,
        // including some more for: water, cocacola, beer
        // Display or return an appropriate response for
        // the following expressions:
        // beer and ball
        // torch and water
        // cocacola or water
        // beer or torch

        if (beer && ball) {
            System.out.println("We got beer and ball");
        } else if (torch && water) {
            System.out.println("We got a torch and some water");
        } else if (cocacola || water) {
            System.out.println("We got some coca cola or some water");
        } else if (beer || torch) {
            System.out.println("We got some beer or a torch");
        } else {
            System.out.println("We found none of the items");
        }



    }
}
