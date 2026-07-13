package overloading_constructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1= new Teacher();

        Teacher teacher2 = new Teacher("kabir","24", 0161);

        teacher2.display();
    }
}
