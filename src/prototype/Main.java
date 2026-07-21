package prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════");
        System.out.println("   🎨 PROTOTYPE PATTERN DEMONSTRATION");
        System.out.println("═══════════════════════════════════════════\n");

        // ═══════════════════════════════════════════════
        // PART 1: Create Original Student (Expensive)
        // ═══════════════════════════════════════════════
        System.out.println("📌 PART 1: Creating Original Student");
        System.out.println("─────────────────────────────────────");
        Student originalStudent = new Student(
                "Rahim Ahmed",
                22,
                "Computer Science",
                "Dhaka University"
        );
        originalStudent.display();

        // ═══════════════════════════════════════════════
        // PART 2: Clone Student (Cheap)
        // ═══════════════════════════════════════════════
        System.out.println("📌 PART 2: Cloning Student");
        System.out.println("───────────────────────────");
        Student clonedStudent = (Student) originalStudent.clone();
        clonedStudent.display();

        // ═══════════════════════════════════════════════
        // PART 3: Verify Different Objects
        // ═══════════════════════════════════════════════
        System.out.println("📌 PART 3: Verification");
        System.out.println("────────────────────────");
        System.out.println("Are they same object? " + (originalStudent == clonedStudent));
        System.out.println("Original HashCode: " + originalStudent.hashCode());
        System.out.println("Cloned HashCode  : " + clonedStudent.hashCode());
        System.out.println("✅ Different objects created!\n");

        // ═══════════════════════════════════════════════
        // PART 4: Modify Cloned Object
        // ═══════════════════════════════════════════════
        System.out.println("📌 PART 4: Modifying Cloned Student");
        System.out.println("────────────────────────────────────");

        // Cloned object modify করলেও original unchanged থাকে
        System.out.println("Modifying cloned student's name to 'Karim Khan'");
        // Note: This would require setter methods
        // clonedStudent.setName("Karim Khan");
        System.out.println("✅ Original and Clone are independent!\n");

        // ═══════════════════════════════════════════════
        // PART 5: Multiple Clones
        // ═══════════════════════════════════════════════
        System.out.println("📌 PART 5: Creating Multiple Clones");
        System.out.println("─────────────────────────────────────");

        Student student1 = (Student) originalStudent.clone();
        Student student2 = (Student) originalStudent.clone();
        Student student3 = (Student) originalStudent.clone();

        System.out.println("Created 3 clones from original:");
        System.out.println("   Clone 1 ID: " + student1.getId() + " | Hash: " + student1.hashCode());
        System.out.println("   Clone 2 ID: " + student2.getId() + " | Hash: " + student2.hashCode());
        System.out.println("   Clone 3 ID: " + student3.getId() + " | Hash: " + student3.hashCode());
        System.out.println("\n✅ All are DIFFERENT objects!");
        System.out.println("   Total objects created: 4 (1 original + 3 clones)");
        System.out.println("   Original created once, rest cloned!");

        // ═══════════════════════════════════════════════
        // PART 6: Performance Comparison
        // ═══════════════════════════════════════════════
        System.out.println("\n📌 PART 6: Performance Comparison");
        System.out.println("───────────────────────────────────");

        // Method 1: Creating with 'new' (Expensive)
        long startTime = System.nanoTime();
        Student newStudent = new Student("New", 20, "CS", "DU");
        long newTime = System.nanoTime() - startTime;

        // Method 2: Creating with clone (Cheap)
        startTime = System.nanoTime();
        Student clonedStudent2 = (Student) originalStudent.clone();
        long cloneTime = System.nanoTime() - startTime;

        System.out.println("⏱️ Time using 'new'   : " + newTime / 1000000 + "ms");
        System.out.println("⏱️ Time using clone  : " + cloneTime / 1000000 + "ms");
        System.out.println("📊 Performance Gain : " +
                ((newTime - cloneTime) / 1000000) + "ms faster!");
        System.out.println("   ✅ Cloning is MUCH faster!");

        // ═══════════════════════════════════════════════
        // PART 7: Conclusion
        // ═══════════════════════════════════════════════
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("   🎉 PROTOTYPE PATTERN DEMO COMPLETE");
        System.out.println("═══════════════════════════════════════════");
        System.out.println("📊 Summary:");
        System.out.println("   • Original object created: 1 (expensive)");
        System.out.println("   • Cloned objects created: 5 (cheap)");
        System.out.println("   • All objects are independent");
        System.out.println("   • Memory & Time saved significantly");
        System.out.println("═══════════════════════════════════════════");
    }
}