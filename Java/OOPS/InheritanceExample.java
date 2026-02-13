// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main Class
public class InheritanceExample {
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.eat();   // Method from parent class
        obj.bark();  // Method from child class
    }
}
