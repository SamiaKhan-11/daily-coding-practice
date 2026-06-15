import java.util.Scanner;

public class EvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int i;
        int ceven=0;
        int codd=0;
        System.out.println("Enter array elements : ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
                ceven++;
            else
                codd++;
        }
        System.out.println("Even numbers in array = "+ ceven);        
        System.out.println("Odd numbers in array = "+ codd);  
        System.out.println("Print array in reverse : ");
        for(i=n-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }      
    }
}