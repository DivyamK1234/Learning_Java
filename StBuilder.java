package com.example.helloworld;

public class StBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert
        sb.insert(0,'S');         //existing char at that index will move forward
        System.out.println(sb);

        // delete
        sb.delete(0,1);        //like for loop in python
        System.out.println(sb);

        //append
        sb.append("Stark");
        System.out.println(sb);
    }

}
