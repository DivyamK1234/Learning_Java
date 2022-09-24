package com.example.helloworld;

import java.util.*;

public class Greetings {
    public static void main(String[] args){
        System.out.print("Enter 1,2 or 3 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==1) {
            System.out.println("Hello!");
        } else if(n==2){
            System.out.println("Namaste!");
        } else if(n==3) {
            System.out.println("Bonjour!");
        }else{
            System.out.println("Wrong Button");
        }
    }
}
