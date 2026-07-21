package DatabaseApp;

public class DBconnection {
    private static DBconnection instance;
    private DBconnection(){
        System.out.println("🔌 Database Connected Successfully!");
        System.out.println("   Connection ID: " + this.hashCode());
        System.out.println("   Time: " + java.time.LocalTime.now());
        System.out.println("-----------------------------------");
    }

    public static DBconnection createObject(){
        if(instance == null){
            instance = new DBconnection();
        }
        return instance;
    }

    public void executeQuery(String query){
        System.out.println("📊 Executing Query: " + query);
        System.out.println("   Using Connection: " + this.hashCode());
        System.out.println("   ✅ Query Executed Successfully!");
        System.out.println();
    }

    public void beginTransaction(){
        System.out.println("🔄 Transaction Started");
        System.out.println("   Connection: " + this.hashCode());
    }
    public void commitTransaction(){
        System.out.println("💾 Transaction Committed");
        System.out.println("   Connection: " + this.hashCode());
        System.out.println();
    }
}
