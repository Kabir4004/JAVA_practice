package abstraction_problem_solving;

public class Circle extends Shape{
    Circle(double dim1, double dim2){
        super(dim1,dim2);
    }
    @Override
    void area(){
        double result = Math.PI * dim1*dim2;
        System.out.println("Circle is: "+result);
    }
}
