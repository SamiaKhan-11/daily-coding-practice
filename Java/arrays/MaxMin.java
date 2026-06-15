import java.util.Scanner;

public class MaxMin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int i;
        int sum=0;
        System.out.println("Enter array elements : ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        int max=arr[0];
        // int min = arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max){
               // if(arr[i]<min)
                max=arr[i];
               //min=arr[i];
            }
        }
        System.out.println("The lagtest number in array is = " + max);
        System.out.println("The sum of elemnts in array is = " + sum);
    }
}