package DatabaseApp;

public class UserService {
    private DBconnection db;

    public UserService() {
        // Getting the SINGLE instance
        this.db = DBconnection.createObject();
        System.out.println("👤 UserService Created");
        System.out.println("   Using Connection: " + db.hashCode());
        System.out.println();
    }

    public void getAllUsers() {
        System.out.println("📋 Fetching all users from database...");
        db.executeQuery("SELECT * FROM users");
        // Business logic here
        System.out.println("   👥 5 users found");
        System.out.println();
    }

    public void addUser(String name) {
        System.out.println("➕ Adding new user: " + name);
        db.executeQuery("INSERT INTO users VALUES ('" + name + "')");
        System.out.println("   ✅ User added successfully!");
        System.out.println();
    }
}
