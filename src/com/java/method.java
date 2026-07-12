package com.java;

import java.util.Scanner;
public class method {
    public static String input(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.next();
        return name;
    }
    public static void display(String name){
        System.out.println("Hello, "+ name + " how are you!");

    }
    public static void main(String[] args) {
            String name = input();
            display(name);
    }
}
