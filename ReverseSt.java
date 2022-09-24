package com.example.helloworld;

public class ReverseSt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Divyam");
        StringBuilder sbrev = new StringBuilder("");

        for (int i=sb.length()-1; i>=0; i--) {
            sbrev.append(sb.charAt(i));
        }
        System.out.println(sbrev);
    }
}
