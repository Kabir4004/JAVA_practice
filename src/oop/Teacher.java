package oop;

public class Teacher {
    private String name;
    private int age;  // Changed to int
    private String phone_number;

    // Constructor to initialize the object
    public Teacher(String name, int age, String phone_number) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
    }

    // Display method - only displays, doesn't set data
    public void display() {
        System.out.println("Your name = " + name);
        System.out.println("Your age = " + age);
        System.out.println("Your phone_number = " + phone_number);
    }

    // Getter methods (optional but good practice)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phone_number; }
}