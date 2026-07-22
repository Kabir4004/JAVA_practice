package Singleton_pattern;

public class DBconnection {
    private static DBconnection instance;
    private DBconnection(){
        System.out.println("DB connected");
    }
    public static DBconnection getInstance(){
        if(instance == null){
            instance = new DBconnection();
        }
        return instance;
    }
    public void display(String output){
        System.out.println("hey: "+output);
    }
}


