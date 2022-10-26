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
        */

        // Logical operators
        // and - && - if both the expression on the
        // left and on the right are true then it returns true
        // if at least one of the expressions returns false it returns false.

        // or - || - if at least one of the expressions returns true
        // then it returns true
        // if both expressions returns false then it returns false

        int num1 = 5;
        int num2 = 10;

        boolean exp = num1 != num2; // returns true

        boolean meat = num1 == num2; // returns false
        boolean fish = num1 > num2; // return false
        boolean bread = num2 >= num1; // returns true

        // true ->

/*        if (bread) {
            System.out.println("We got bread");
        } else if (meat) {
            System.out.println("We got meat");
        } else if (fish) {
            System.out.println("We got fish");
        } else {
            System.out.println("We couldn't get any of the items");
        }*/

/*        if (bread && fish) { // true && false -> false
            System.out.println("We got bread and fish");
        } else if (meat && fish) { // false && false -> false
            System.out.println("We got meat and fish");
        } else if (meat || bread) { // false || true -> true
            System.out.println("We got meat or bread");
        }*/

        // Initialize student score
        int studentScore = -80;

        // Initialize grade variable for use in remarks
        String grade = "";

        // Check student score and assign appropriate remark.
        if (studentScore >= 0 && studentScore <= 40) {
            grade = "F";
            System.out.println("Student's grade: " + grade);
        } else if (studentScore >= 41 && studentScore <= 50) {
            grade = "D";
            System.out.println("Student's grade: " + grade);
        } else if (studentScore >= 51 && studentScore <= 60) {
            grade = "C";
            System.out.println("Student's grade: " + grade);
        } else if (studentScore >= 61 && studentScore < 70) {
            grade = "B";
            System.out.println("Student's grade: " + grade);
        } else if (studentScore >= 70 && studentScore < 100) {
            grade = "A";
            System.out.println("Student's grade: " + grade);
        } else {
            System.out.println("Invalid score");
        }

        // When dealing with strings, it is advisable to use the
        // .equals() method that comes with string variables to
        // check equality instead of just using the primitive ==
//        grade == "D"
        if (grade.equals("D") || grade.equals("F")) {
            System.out.println("You need to do better!");
        } else if (grade.equals("C") || grade.equals("B")) {
            System.out.println("Good Job, but you can improve");
        } else if (grade.equals("A")) {
            System.out.println("Excellent! Keep it up!");
        } else {
            System.out.println("Invalid grade");
        }

//        System.out.println(false || false); // false

//        Next Up: more on conditionals, switch and loops

    }
}
