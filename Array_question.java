package com.example.helloworld;

import java.util.*;

public class Array_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i=0; i<size; i++) {
            System.out.print("Enter array element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        for (int i=0; i<size; i++) {
            if (x==arr[i]) {
                System.out.println(i);
            }
        }

    }
}
