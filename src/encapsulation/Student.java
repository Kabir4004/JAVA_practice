package encapsulation;

public class Student {
    // Private variables - data hiding
    private String name;
    private int age;
    private double gpa;
    private String studentId;

    // Constructor
    public Student(String name, int age, double gpa, String studentId) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    // Getter methods - public access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods with validation - controlled access
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age! Age must be between 0 and 150.");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error: Invalid GPA! GPA must be between 0.0 and 4.0.");
        }
    }

    // Business method
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Status: " + getStatus());
    }

    // Private helper method - internal use only
    private String getStatus() {
        if (gpa >= 3.5) return "Excellent";
        else if (gpa >= 3.0) return "Good";
        else if (gpa >= 2.0) return "Average";
        else return "Needs Improvement";
    }
}