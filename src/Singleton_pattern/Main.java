package Singleton_pattern;

public class Main {
    public static void main(String[] args) {
        DBconnection person1 = DBconnection.getInstance();
        person1.display("hello");
    }
}
