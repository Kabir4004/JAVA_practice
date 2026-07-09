package com.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        String name = "";

        // Age ইনপুট নেওয়া - যতক্ষণ না valid integer পাচ্ছি
        while (true) {
            System.out.println("enter your age:");
            String input = sc.nextLine();
            try {
                age = Integer.parseInt(input);
                break; // valid age পেলে loop থেকে বেরিয়ে যাবে
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for age.");
                // loop আবার চলবে
            }
        }

        // Name ইনপুট নেওয়া - যতক্ষণ না empty ছাড়া কিছু পাচ্ছি
        while (true) {
            System.out.println("enter your name:");
            name = sc.nextLine();
            if (!name.trim().isEmpty()) {
                break; // valid name পেলে loop থেকে বেরিয়ে যাবে
            }
            System.out.println("Name cannot be empty! Please enter your name.");
        }

        System.out.println("your age is: " + age);
        System.out.println("your name is: " + name);
    }
}