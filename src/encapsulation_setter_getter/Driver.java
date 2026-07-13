package encapsulation_setter_getter;

public class Driver {
    private String name;
    private int age;
    public String universityName="any name";

    public void setName(String name){
        this.name =name;
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


}
