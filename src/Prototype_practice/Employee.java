package Prototype_practice;

public class Employee implements EmployeePrototype{

   private String name, role, department;
   private int id, salary;

   public Employee(String name, int id, String department, String role, int salary){
       this.name = name;
       this.id = id;
       this.department = department;
       this.role =role;
       this.salary= salary;
   }


    public EmployeePrototype clone(){
        return new Employee(this.name, this.id, this.department, this.role, this.salary);
    }

    public void setName(String name){
       this.name = name;
    }
    public void setId(int id){
       this.id = id;
    }
    public void display(){
        System.out.println("Name: "+name +", ID: "+id+", Department:"+department+", Role:"+role+", Salary:"+salary);
    }
}
