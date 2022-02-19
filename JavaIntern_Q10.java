/*
Q10. Write a java Program to find the transpose of the matrix.
 */

package com.Tathastu;

import java.util.Scanner;

public class JavaIntern_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers of rows in the matrix: ");
        int m = sc.nextInt();
        System.out.println("Numbers of columns in the matrix: ");
        int n = sc.nextInt();
        int [][] matrix = new int [m][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
               matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i=0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the Matrix: ");
        for(int i=0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}

