class One{
    void display(){
        System.out.println("Parent class method");
    }
}
class Two extends One{
    void display(){
        System.out.println("child class method")
    }
}
class overriding{
    One o1=new One();
    two t=new Two();
    o1.display();
    t.display();
}