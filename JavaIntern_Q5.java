/*
Q5. Write a java program to calculate Permutations and combinations of 2 Numbers.
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q5 {

    static long factorial(int num){
        long x = 1;
        for(long i=1; i<=num; i++){
            x = x*i;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Permutation = (int)(factorial(a)/factorial(a-b));
        int Combination = (int)(factorial(a)/(factorial(a-b)*factorial(b)));
        System.out.println("Permutation: " +Permutation);
        System.out.println("Combination: " +Combination);

    }
}
