package oop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.next();

        System.out.println("enter your age");
        int age = input.nextInt();

        System.out.println("enter your phone_number");
        String phone_number = input.next();

        Teacher teacher1 = new Teacher(name, age,phone_number);
        teacher1.display();

        input.close();

    }
}