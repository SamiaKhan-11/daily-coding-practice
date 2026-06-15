import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {

    public static boolean containDuplicates(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num))
                return true;
            else
                set.add(num);
        }  
        return false;
    }

    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int i;
        System.out.print("Enter array elements : ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(containDuplicates(arr));
    }
    
}
