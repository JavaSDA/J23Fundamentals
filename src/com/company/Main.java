package com.company;

public class Main {

    // public, private - access modifier
    // class - blueprint for creating objects.

    // method represents the action taken by an object
    // The main method is the entry point of any Java program without it, the program won't run.

    // a comment is a piece of text that you write in your code that doesn't get compiled
    // it can be used to give messages to the developer or also write notes on how the operation is
    // being carried out.

    // - Single line comment
    /* Multi line comment */
    // void - tells the compiler that this method doesn't return anything.
    // boilerplate code - repeated code that is usually generated for you by the IDE

    // As a convention in java, we name classes starting with a capital letter and proceeding with camel case
    // e.g MainComponentClass
    // For variables and methods on the other hand, we start with a small letter and subsequent letters will
    // use camel casing e.g mainComponentVariable
    // for methods, they should start with verbs: getMainComponent()

    // We say Java is a statically typed language, this is because all variables or
    // methods declared in Java must have a type attached to it.

    // Concatenation is the process of joining two strings using the + operator,
    // N.B: Any primitive value combined with a string using the + operator is
    // also concatenated to the string.

    /**
     * documentation comment
     * @param args
     */
    public static void main(String[] args) {

        // A bit also binary digit i.e 1 or 0
        // 1 byte = 8 bits
        // 4 bytes = 32 bits

        // primitive datatypes
        /*
        - boolean - true or false
        - byte - -128 to 127 (2^8=256)
        - short - numbers - 2 bytes  -32768 to 32767
        - int - whole numbers e.g 1, 2, 3, 23, 55 - 4 bytes - -2147483648 to 2147483647
        - long - whole numbers e.g 1, 2, 3, 23, 55 - 8 bytes
        - float - decimal - 4 bytes
        - double - decimal - 8 bytes
        * */
        // complex objects
        // String - enclosed inside "" e.g "Some text"

        // A variable is a container or box for storing data in our code. You can think of it
        // like a box that's labelled.

/*
        // declaration (declare)
        int number;
        boolean flag;
        String text;

        // initialization (initialize)
        number = 2;
        flag = false;
        text = "Happy Feet";

        int secondNum = 7;

        // Operators
        // Java supports the basic arithmetic operators
        // + - Addition
        // - - subtraction
        // * - Multiplication
        // / - Division
        // % - Modulus

        float result = 0;
        // Addition
        result = number + secondNum;
        System.out.println("Addition: " + result);

        // Subtraction
        result = secondNum - number;
        System.out.println("Subtraction: " + result);

        // Multiplication
        result = secondNum * number;
        System.out.println("Multiplication: " + result);

        // Division
        result = secondNum / number;
        System.out.println("Division: " + result);

        // Modulus - returns the remainder of a division operation
        result = secondNum % number;
        System.out.println("Modulus: " + result);
*/


        // conditionals
        // comparative logical operators
        /*
        - Greater than >
        - Less than <
        - Equals ==
        - Greater than or equal >=
        - Less than or equal <=
        - Not equal !=
        * */

        int num1 = 5;
        int num2 = 10;

        boolean expression = num1 != num2;

        if (num1 > num2) {
            System.out.println("Num1 is greater!");
        } else {
            System.out.println("Num2 is greater!");
        }


//        System.out.println(expression);

    }
}
