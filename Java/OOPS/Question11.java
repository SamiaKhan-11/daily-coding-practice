import java.util.*;

class Question11 {

    static int power(int a, int b) throws Exception {
        
        if (a <= 0 || b <= 0) {
            throw new Exception("Numbers must be greater than 0");
        }

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the values:");
            int n = sc.nextInt();
            int m = sc.nextInt();

            int pow = power(n, m);  // risky call
            System.out.println("Result: " + pow);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}