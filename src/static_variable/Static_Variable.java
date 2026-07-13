package static_variable;

public class Static_Variable {
   static int count = 0;

    Static_Variable(){
        count++;
    }
    void totalStudent(){
        System.out.println("total student = "+count);
    }
}
