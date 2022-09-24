package com.example.helloworld;

import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int mat[][] = new int[rows][cols];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.println("Enter ("+i+","+j+") element: ");
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (x==mat[i][j]) {
                    System.out.println(i+" "+j);
                } else{
                    System.out.println("Number missing!");
                }
            }
        }

    }
}
