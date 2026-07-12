package oop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("Enter your age:");
        String age = input.next();

        System.out.println("Enter your phone_number:");
        String phone_number = input.next();

        teacher1.setData(name, age, phone_number);
        teacher1.display();  // No arguments needed now

        input.close();
    }
}