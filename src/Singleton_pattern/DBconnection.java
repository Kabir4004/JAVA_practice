package Singleton_pattern;

public class DBconnection {
    private static DBconnection instance;

    private DBconnection(){
        System.out.println("Database connected!");
    }

    public static DBconnection getInstance(){
        if(instance == null){
            instance = new DBconnection();
        }
        return instance;
    }

    public void display(String query){
        System.out.println("Executing:" + query);
    }
}


