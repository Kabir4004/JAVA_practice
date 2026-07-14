package inheritance;

public class Teacher extends Person {
    String qualification;

    void display1(){
        display();
        System.out.println("qualification: "+qualification);
    }
}
