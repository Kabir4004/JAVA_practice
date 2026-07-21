package Singleton_pattern;

public class Main {
    public static void main(String[] args) {
        DBconnection user1 = DBconnection.getInstance();
        user1.display("hello");
    }
}
