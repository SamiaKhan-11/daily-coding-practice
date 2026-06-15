import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int n,int arr[]){

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i))
                return i;
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int value=missingNumber(n,arr);
        System.out.println("The missing value is : "+value);
    }
    
}
