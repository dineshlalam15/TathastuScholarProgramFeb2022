/*
Q7. Write a java program to reverse the letters present in the given string.
 */

package com.Tathastu;

import java.util.Arrays;
import java.util.Scanner;

public class JavaIntern_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        int l = s.length();
        char [] arr = s.toCharArray();
        System.out.println("Reversed String: ");
        for(int i=l-1; i>=0; i--){
            System.out.print(arr[i] + "");
        }

        /*
        // Method2: Using String Builder.
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1.reverse();
        System.out.println(s1);

         */

    }
}
