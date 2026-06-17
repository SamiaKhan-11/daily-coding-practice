
import java.util.Scanner;
import java.util.HashSet;

public class FindDuplicates {

    public static boolean containDuplicates(int arr[]) {
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        boolean flag=false;
        for (int num : arr) {
            if (unique.contains(num)) {
                duplicate.add(num);
                flag=true;
            } else
                unique.add(num);
        }
        System.out.println("Unique array set : " + unique);
        System.out.println("Duplicate array set : " + duplicate);
        return flag;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (containDuplicates(arr))
            System.out.println("Array contains duplicates");
        else
            System.out.println("Array does not contains duplicates");
    }
}
