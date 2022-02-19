/*
Q3. write a java program to calculate a factorial of a number.
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q3 {

    static long factorial(int n){
        if(n<0){
            return -1;
        }
        else  if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("The factorial of " +a+ " is: ");
        System.out.println(factorial(a));

    }
}
