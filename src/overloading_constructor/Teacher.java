package overloading_constructor;

public class Teacher {
    String name,gender;
    int phone;

    Teacher(){
        System.out.println("No information");

    }
    Teacher(String name, String age){
    this.name = name;
    this.gender= age;
    }
    Teacher(String name,String age, int phone){
        this.name =name;
        this.gender =age;
        this.phone = phone;

    }
    void display(){
        System.out.println("name= "+name);
        System.out.println("age= "+gender);
        System.out.println("phone number = "+phone);
    }
}
