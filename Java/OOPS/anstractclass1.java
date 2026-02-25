//Write a really simple program in java implement abstract class shape and its subclass circle and rectangle. Now we include two abstract method area in shape and implement them in both sub classes but we implement only one method per class so what different.//the limitation is one class will only implement one method
//this is hierarchrical inheritance
import java.util.Scanner;
abstract class Shape{
    abstract void area();
    abstract void perimeter();
}

abstract class Rectangle extends Shape{
    void area(){
        int l=20;
        int b=10;
        System.out.println("Area of Rectangle:" + (l*b));
    }
    
}
class Rect extends Rectangle{
    void perimeter(){
        int l=20;
        int b=10;
        System.out.println("Perimeter of Rectangle:" + (2*(l+b)));
    }
}
 
public class anstractclass1{
    public static void main(String args[]){
        Rect r1 =   new Rect();
        r1.area();
        r1.perimeter();
    }
}