//write a program to check method overriding with final keyword also demostrate the use of final variable
  class Parent {
    
     void display() {
        System.out.println("This is a final method in the parent class.");
         System.out.println("Final variable value: " + new Final().value);
    }
}
class Child extends Parent {

    // This will cause a compile-time error because display() is final in the parent class
    void display() {
        System.out.println("This is an overridden method in the child class.");
         System.out.println("Final variable value: " + new Final().value);

    }
}
public class Final {
    final int value = 100; // This is a final variable
    public static void main(String[] args) {
        
        Child obj = new Child();
        Parent parentObj = new Parent();
        obj.display(); // This will call the display method of the child class
        parentObj.display(); // This will call the display method of the parent class
        System.out.println("Final variable value: " + new Final().value);
    }
}
