package encapsulation_setter_getter;

public class Driver {
    private String name;
    private int age;
    public String universityName;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setUniversityName(String universityName){
        this.universityName=universityName;
    }
    public String getUniversityName(){
        return universityName;
    }
    public void display(){
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("University name: "+getUniversityName());
    }

}
