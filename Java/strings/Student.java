class Student {
    int id;
    String name;
    static String classname;

    Student() {
        id = 101;
        name = "IILM";
    }

    public static void main(String[] args) {
        int x = 100;
        Student sc = new Student();

        System.out.println(sc.id);
        System.out.println(sc.name);
        System.out.println(Student.classname);
        System.out.println(x);
    }
}
