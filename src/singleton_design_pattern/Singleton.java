package singleton_design_pattern;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("hello!");
    }

    public static Singleton createObject(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void executeQuery(String query){
        System.out.println("Executing: "+ query);
    }
}
