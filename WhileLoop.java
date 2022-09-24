package com.example.helloworld;

import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0;
        for (int i=1;i<=n;i++) {
            sum += i;
        }

        System.out.println("Sum of First N natural numbers is : "+sum);

    }
}
