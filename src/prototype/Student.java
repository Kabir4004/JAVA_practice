package prototype;

// Step 1: Prototype Interface
interface Prototype {
    Prototype clone();
}

// Step 2: Concrete Prototype - Student
public class Student implements Prototype {
    // ═══════════════════════════════════════════════
    // Student Properties
    // ═══════════════════════════════════════════════
    private String name;
    private int age;
    private String department;
    private String university;
    private int id;
    private Course[] courses;  // Complex object

    // ═══════════════════════════════════════════════
    // Constructor
    // ═══════════════════════════════════════════════
    public Student(String name, int age, String department, String university) {
        System.out.println("🆕 Creating NEW Student object (Expensive operation!)");
        this.name = name;
        this.age = age;
        this.department = department;
        this.university = university;
        this.id = (int)(Math.random() * 10000);
        this.courses = new Course[]{new Course("Math"), new Course("Physics")};

        // Simulating expensive operation
        try {
            Thread.sleep(100);  // Database/Network call simulation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("✅ Student created successfully!");
        System.out.println("   Time taken: 100ms (expensive)");
        System.out.println();
    }

    // ═══════════════════════════════════════════════
    // Private Constructor for Cloning
    // ═══════════════════════════════════════════════
    private Student(Student student) {
        System.out.println("📋 Cloning Student (Cheap operation!)");
        this.name = student.name;
        this.age = student.age;
        this.department = student.department;
        this.university = student.university;
        this.id = student.id + 1;  // New ID
        // Deep copy of courses
        this.courses = new Course[student.courses.length];
        for (int i = 0; i < student.courses.length; i++) {
            this.courses[i] = new Course(student.courses[i].getName());
        }
        System.out.println("✅ Student cloned successfully!");
        System.out.println("   Time taken: 1ms (cheap)");
        System.out.println();
    }

    // ═══════════════════════════════════════════════
    // Clone Method (Prototype Pattern)
    // ═══════════════════════════════════════════════
    @Override
    public Prototype clone() {
        return new Student(this);  // Using private copy constructor
    }

    // ═══════════════════════════════════════════════
    // Getter Methods
    // ═══════════════════════════════════════════════
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getUniversity() { return university; }
    public int getId() { return id; }

    // ═══════════════════════════════════════════════
    // Display Method
    // ═══════════════════════════════════════════════
    public void display() {
        System.out.println("════════════════════════════════");
        System.out.println("🎓 STUDENT INFORMATION");
        System.out.println("════════════════════════════════");
        System.out.println("📛 Name        : " + name);
        System.out.println("🔢 ID          : " + id);
        System.out.println("📅 Age         : " + age);
        System.out.println("🏫 Department  : " + department);
        System.out.println("🎓 University  : " + university);
        System.out.println("📚 Courses     : ");
        for (Course c : courses) {
            System.out.println("   - " + c.getName());
        }
        System.out.println("📌 Object Hash : " + this.hashCode());
        System.out.println("════════════════════════════════");
        System.out.println();
    }
}

// ═══════════════════════════════════════════════
// Course Class (Helper)
// ═══════════════════════════════════════════════
class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }
}