class First {
    int a;

    First(int a) {
        this.a = a;
        System.out.println("First Class Constructor");
    }
}

class Second extends First {

    Second() {
        super(10);   // Calling parent constructor
        System.out.println("Second Class Constructor");
    }
}

class Main {
    public static void main(String args[]) {
        Second sc = new Second();
        System.out.println("Value of a: " + sc.a);
    }
}
