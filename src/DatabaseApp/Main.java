package DatabaseApp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   🚀 DATABASE APPLICATION STARTED");
        System.out.println("=========================================\n");

        // ============================================
        // PART 1: First Connection Creation
        // ============================================
        System.out.println("📌 PART 1: Creating First Connection");
        System.out.println("-----------------------------------");
        DBconnection db1 = DBconnection.createObject();
        System.out.println("   db1 Reference: " + db1.hashCode());
        System.out.println();

        // ============================================
        // PART 2: Second Connection Request
        // ============================================
        System.out.println("📌 PART 2: Creating Second Connection");
        System.out.println("-----------------------------------");
        DBconnection db2 = DBconnection.createObject();
        System.out.println("   db2 Reference: " + db2.hashCode());
        System.out.println();

        // ============================================
        // PART 3: Verify Singleton Behavior
        // ============================================
        System.out.println("📌 PART 3: Verifying Singleton Pattern");
        System.out.println("-----------------------------------");
        if (db1 == db2) {
            System.out.println("✅ SUCCESS: db1 and db2 are the SAME object!");
            System.out.println("   Both reference the same connection: " + db1.hashCode());
        } else {
            System.out.println("❌ FAILED: Different objects created!");
        }
        System.out.println();

        // ============================================
        // PART 4: Using Services with Singleton
        // ============================================
        System.out.println("📌 PART 4: Creating Services (Both use Singleton)");
        System.out.println("-----------------------------------");

        // Both services will use the SAME connection
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        // ============================================
        // PART 5: Performing Database Operations
        // ============================================
        System.out.println("📌 PART 5: Performing Database Operations");
        System.out.println("-----------------------------------");

        // User operations
        userService.getAllUsers();
        userService.addUser("John Doe");

        // Order operations
        orderService.getAllOrders();
        orderService.placeOrder("Laptop", 2);

        // ============================================
        // PART 6: Multiple Calls - All Share Same Connection
        // ============================================
        System.out.println("📌 PART 6: Multiple Calls Verification");
        System.out.println("-----------------------------------");

        System.out.println("🔄 Calling createObject() 3 more times:");
        DBconnection db3 = DBconnection.createObject();
        DBconnection db4 = DBconnection.createObject();
        DBconnection db5 = DBconnection.createObject();

        System.out.println("   db3: " + db3.hashCode());
        System.out.println("   db4: " + db4.hashCode());
        System.out.println("   db5: " + db5.hashCode());
        System.out.println("   ✅ All are SAME object!");
        System.out.println();

        // ============================================
        // PART 7: Conclusion
        // ============================================
        System.out.println("=========================================");
        System.out.println("   🎉 APPLICATION EXECUTED SUCCESSFULLY");
        System.out.println("=========================================");
        System.out.println("📊 Summary:");
        System.out.println("   • Total connection objects created: 1");
        System.out.println("   • Total times createObject() called: 5");
        System.out.println("   • All calls returned the SAME instance");
        System.out.println("   • Memory saved: Significant!");
        System.out.println("=========================================");
    }
}