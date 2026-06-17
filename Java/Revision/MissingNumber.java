import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {

    public static int findMissing(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int num : arr) {
            set.add(num);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i))
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];

        System.out.print("Enter array elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Missing Number is " + findMissing(arr));
    }
}
