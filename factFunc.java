package com.example.helloworld;

import java.util.*;

public class factFunc {
    public static int calculateFactorial (int a) {
        int c = 1;
        for (int i=1; i<=a; i++) {
            c = c*i;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = calculateFactorial(n);
        System.out.println(factorial);
    }
}
