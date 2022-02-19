/*
Q4. Write a java program to find out whether the given string is palindrome or not
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q4 {
    static boolean isPalindrome(String s){
        int l =0;
        int h = s.length()-1;
        char [] arr = s.toCharArray();
        while(l<h){
            if(arr[l]!=arr[h]){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word = sc.nextLine();
        if(isPalindrome(word)){
            System.out.println("It is a PALINDROME");
        }
        System.out.println("It is NOT a PALINDROME!");
    }
}
