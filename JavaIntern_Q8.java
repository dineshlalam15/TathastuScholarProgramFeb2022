/*
Q8. Write a java program to check the given array is mirror inverse or not.
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q8 {

    static boolean isMirrorInverse(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
        Inverse of an array means if the array elements are swapped with their corresponding indices
        and the array is called mirror-inverse if it's inverse is equal to itself.
        */

        int [] arr= { 1, 2, 3, 0 };
        if (isMirrorInverse(arr)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

