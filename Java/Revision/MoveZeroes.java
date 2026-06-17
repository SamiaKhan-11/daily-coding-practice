package Revision;

import java.util.*;

public class MoveZeroes {

    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index;i<n;i++){
            arr[i]=0;
        }
        System.out.println("Array Elements : ");
         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }   
}
