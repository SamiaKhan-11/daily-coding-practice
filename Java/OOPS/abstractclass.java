//Write a really simple program in java implement abstract class shape and its subclass circle and rectangle. Include an abstract method area in shape and implement them in both sub classes.
import java.util.Scanner;
abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    void area(){
        int r=5;
        System.out.println("Area of Circle:" + (3.14*r*r));
    }
}
class Rectangle extends Shape{
    void area(){
        int l=20;
        int b=10;
        System.out.println("Area of Rectangle:" + (l*b));
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
        Rectangle r=new Rectangle();
        r.area();

    }
}

