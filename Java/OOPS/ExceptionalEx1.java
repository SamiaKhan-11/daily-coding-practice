public class ExceptionalEx1 {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};   // size = 4

        try {
            // Trying to print 5 elements
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        }

        catch (Exception e) {
            System.out.println("Error: You are trying to access element outside the array size.");
        }

        System.out.println("Program continues after exception handling.");
    }
}