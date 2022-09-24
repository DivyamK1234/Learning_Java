package com.example.helloworld;

import java.util.*;

public class prodFunc {
    public static int calculateProduct(int a,int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = calculateProduct(num1,num2);
        System.out.println(product);
    }
}
