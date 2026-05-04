class Student extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.print("Hi! Student" + " ");
        }
    } 
}

class MCA extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.print("Hello! MCA" + " ");
        }
    }
}

class ThreadExample {
    public static void main(String args[]){
        Student m=new Student();
        MCA n=new MCA();
        //output will be in order the objects are called uisng the method
        // n.display();
        // m.display();
        m.start();
        n.start();
    }
} 


