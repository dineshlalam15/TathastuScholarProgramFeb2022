/*
Q1. Write a Java program to perform basic calculator operations
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q1 {
    public static void main(String[] args) {
        /*
        Basic calculator operations are:
        addition(+), Subtraction(-), Multiplication(*), Division(/).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter number2: ");
        double num2 = sc.nextDouble();
        System.out.println("Select your Operation: +,-,*,/");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println(result);
    }
}

