package oop;

public class Teacher {
    String name;
    int age;  // Keeping as String if you prefer
    String phone_number;

    Teacher(String name, int age, String phone_number) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
    }

    void display() {  // No parameters needed now
        System.out.println("Your name = " + this.name);  // Using this.name
        System.out.println("Your age = " + this.age);
        System.out.println("Your phone_number = " + this.phone_number);
    }
}