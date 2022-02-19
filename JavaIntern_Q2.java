/*
Q2. Write a java program to calculate fibonacci series up to n numbers.
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q2 {

    static int fibonacci(int n){
        if(n==1|| n ==2){
            return n-1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int a = sc.nextInt();
        System.out.println("Fibonacci number: ");
        System.out.println(fibonacci(a));
    }
}
