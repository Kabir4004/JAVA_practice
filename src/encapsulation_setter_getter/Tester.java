package encapsulation_setter_getter;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Driver person1 = new Driver();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("enter your age:");
        int age =input.nextInt();
        input.nextLine();
        System.out.println("enter your varsity name:");
        String varsityName = input.nextLine();

        person1.setName(name);
        person1.setAge(age);
        person1.setUniversityName(varsityName);

        person1.display();
    }
}
