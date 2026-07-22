package Prototype_practice;

public class Main {
    public static void main(String[] args) {
        EmployeePrototype emp = new Employee("Name", 000, "IT", "SWE", 50000000);
        Employee emp1 = (Employee) emp.clone();

        emp1.setName("kabir");
        emp1.setId(111);

        System.out.println("Prototype Employee:");
        ((Employee)emp).display();
    }
}
