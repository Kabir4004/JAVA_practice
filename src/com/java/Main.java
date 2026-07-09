package com.java;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        int [] marks = new int[3];
        marks[0] = 97;
        marks[1] = 100;
        marks[2] = 45;

        System.out.println(marks.length);
        System.out.println(marks[1]);
        Arrays.sort(marks);
        System.out.println(marks[1]);

    }
}
