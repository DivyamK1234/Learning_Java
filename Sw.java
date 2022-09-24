package com.example.helloworld;

import java.util.*;

public class Sw {
    public static void main(String[] args) {
        System.out.print("Enter button number : ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 :
                System.out.println("Hello!");
                break;
            case 2 :
                System.out.println("Namaste!");
                break;
            case 3 :
                System.out.println("Bonjour!");
                break;
        }

    }
}
