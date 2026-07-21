package DatabaseApp;

public class OrderService {
    private DBconnection db;

    public OrderService() {
        // Getting the SAME single instance
        this.db = DBconnection.createObject();
        System.out.println("📦 OrderService Created");
        System.out.println("   Using Connection: " + db.hashCode());
        System.out.println();
    }

    public void getAllOrders() {
        System.out.println("📋 Fetching all orders from database...");
        db.executeQuery("SELECT * FROM orders");
        System.out.println("   📦 3 orders found");
        System.out.println();
    }

    public void placeOrder(String product, int quantity) {
        System.out.println("🛒 Placing order for: " + product + " (Qty: " + quantity + ")");
        db.beginTransaction();
        db.executeQuery("INSERT INTO orders VALUES ('" + product + "', " + quantity + ")");
        db.commitTransaction();
        System.out.println("   ✅ Order placed successfully!");
        System.out.println();
    }
}
