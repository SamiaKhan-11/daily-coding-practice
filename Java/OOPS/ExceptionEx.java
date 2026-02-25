class ExceptionEx {

    public static void main(String args[]) {

        int a, b;

        try {
            b = 0;
            a = 50 / b;
            System.out.println("This will be bypassed");
        }

        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("After Catch");
    }
}