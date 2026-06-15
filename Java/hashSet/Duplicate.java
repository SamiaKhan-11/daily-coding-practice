import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {

    public static boolean containDuplicates(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        boolean dupFound = false;
        for(int num : arr){
            if(set.contains(num)){
                dupFound=true;
                set2.add(num);
            }

            else
                set.add(num);
        }  
        System.out.println("The unique set is =" + set);
        System.out.println("The duplicate set is : "+ set2);
        return dupFound;
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

        if(containDuplicates(arr))
            System.out.println("The Array contains duplicates!");
        else
             System.out.println("The Array does not contains duplicates!");
    }
    
}
