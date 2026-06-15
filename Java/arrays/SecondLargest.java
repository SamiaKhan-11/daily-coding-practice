import java.util.*;

public class SecondLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int i;
        int[] arr=new int[n];
       
        System.out.println("Enter array elements : ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int SecondLargest=-1;

        for(i=1;i<n;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        System.out.println("The largest number in array is = " + largest);
        System.out.println("The second largest number in array is = " + SecondLargest);
    }
}
