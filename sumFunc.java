package com.example.helloworld;

import java.util.*;

public class sumFunc {
    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = sum(num1,num2);
        System.out.println(a);

    }
}
