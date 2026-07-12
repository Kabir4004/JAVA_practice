package oop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("Enter your age:");
        int age = input.nextInt();  // Now reads as int

        System.out.println("Enter your phone number:");
        String phone_number = input.next();

        // Create teacher object with constructor
        Teacher teacher1 = new Teacher(name, age, phone_number);

        // Display the information
        teacher1.display();

        input.close();  // Good practice to close Scanner
    }
}