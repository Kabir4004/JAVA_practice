package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating student object
        Student student1 = new Student("John Doe", 20, 3.8, "S001");

        // Accessing data through getters (controlled access)
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("GPA: " + student1.getGpa());
        System.out.println("ID: " + student1.getStudentId());

        // Modifying data through setters (with validation)
        System.out.println("\n=== Updating Student Information ===");
        student1.setName("Jane Smith");
        student1.setAge(21);
        student1.setGpa(3.9);

        // Display complete information
        System.out.println("\n=== Updated Student Information ===");
        student1.displayStudentInfo();

        // Testing validation
        System.out.println("\n=== Testing Validation ===");
        student1.setAge(200);      // Invalid - will show error
        student1.setGpa(5.0);      // Invalid - will show error
        student1.setName("");      // Invalid - will show error

        // Creating another student
        Student student2 = new Student("Alice Johnson", 19, 2.5, "S002");
        System.out.println("\n=== Another Student ===");
        student2.displayStudentInfo();
    }
}
