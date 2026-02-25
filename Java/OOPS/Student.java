class Student{
    int r;
    String n;

    Student(){
        r=100;
        n="IILM";
    }
    Student(Student s){
        r=s.r;
        n=s.n;
    }
    Student(int r, String n){
        this.r=r;
        this.n=n;
    }
    void display(){
        System.out.println("Roll no: "+r);
        System.out.println("Name: "+n);
    }
    
}