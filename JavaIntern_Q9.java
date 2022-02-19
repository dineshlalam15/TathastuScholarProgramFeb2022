/*
Q9. Write a java Program to remove elements from an ArrayList.
 */

package com.Tathastu;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaIntern_Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(10);
        list.add(18);
        list.add(93);
        list.add(33);
        list.add(7);
        list.add(17);
        System.out.println("ArrayList: " +list);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the element you wan to remove: ");
        int a = sc.nextInt();
        if(a>=0 && a< list.size()) {
            list.remove(a);
            System.out.println("Element at index " + a + " is removed!");
            System.out.println(list);
        }
        else{
            System.out.println("Invalid Index");
        }
    }
}
