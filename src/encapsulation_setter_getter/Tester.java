package encapsulation_setter_getter;

public class Tester {
    public static void main(String[] args) {
        Driver person1 = new Driver();
        person1.setName("kabir");
        person1.setAge(24);

        person1.display(person1.getName(), person1.getAge());
    }
}
