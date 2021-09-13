/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int product;
        int quotient;

        /*Prompting for first number*/
        System.out.println("What is the first number?");
        firstNumber = scan.nextInt();

        /*Prompting for second number*/
        System.out.println("What is the second number?");
        secondNumber = scan.nextInt();

        /*Adding the numbers*/
        sum = firstNumber + secondNumber;
        /*Subtracting the numbers*/
        difference = firstNumber - secondNumber;
        /*Multiplying the numbers*/
        product = firstNumber * secondNumber;
        /*Dividing the numbers*/
        quotient = firstNumber / secondNumber;

        /*Displaying output*/
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", +firstNumber, +secondNumber, +sum, +firstNumber, +secondNumber, +difference, +firstNumber, +secondNumber, +product, +firstNumber, +secondNumber, +quotient);
    }
}
