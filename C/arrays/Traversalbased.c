//Traversal based array which include sum of elements, count even odd, find min/max and average.
#include<stdio.h>
int main(){
    int arr[20],n,i,SumEven=0,SumOdd=0,sum=0,min,max;
    float avg=0;
    printf("Enter number of elements in an array : ");
    scanf("%d",&n);
    printf("Enter array elements : ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
        if(arr[i]%2==0)
        SumEven+=arr[i]; 
        else
        SumOdd+=arr[i];
    }
    avg = (float)sum/n;
    printf("\nSum of elements : %d ",sum);
    printf("\nAvg of elements : %.2f ",avg);
    printf("\nSum of even elements : %d ",SumEven);
    printf("\nSum of odd elements : %d ",SumOdd);
    min=max=arr[0];
    for(i=0;i<n;i++){
        if(arr[i]<min)
        min=arr[i];
        if(arr[i]>max)
        max=arr[i];
    }
    printf("\nMax element : %d ",max);
    printf("\nMin element : %d ",min);
    return 0;
}