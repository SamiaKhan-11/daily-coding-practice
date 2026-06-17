package Revision;


import java.util.*;
public class SecondLargest {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int SecondLargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>SecondLargest)
                SecondLargest=arr[i];
        }
        System.out.println("The Largest element in array is = " + largest);
        System.out.println("The Second largest element in array is = " +SecondLargest);
    }
    
}
