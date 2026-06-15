import java.util.*;

public class MoveZero {
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
        int index=0;
        for(i=0;i<n;i++){
            if(arr[i]!=0){
               arr[index]=arr[i];
               index++; 
            }
        }
        for(i=index;i<n;i++){
            arr[i]=0;
        }
        System.out.println("The array elements : ");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
