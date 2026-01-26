//Linear search
// #include<stdio.h>
// int main(){
//     int a[20],n,i,x,flag=0;
//     printf("Enter number of elements in an array : ");
//     scanf("%d",&n);
//     printf("Enter array elements : ");
//     for(i=0;i<n;i++){
//         scanf("%d",&a[i]);
//     }
//     printf("Enter the element to search : ");
//     scanf("%d",&x);
//     for(i=0;i<n;i++){
//         if(x==a[i]){
//             flag=1;
//         printf("Element %d found in place %d ",a[i],i+1);
//         }
//     }
//     if(flag==0){
//         printf("Element %d not found in array ",x);
//     }
//     return 0;
// }

//Binary Search to find last occurence of an element in a sorted array
#include<stdio.h>
int main(){
    int a[20],n,i,x,start,end,mid,c=0;
    printf("Enter number of elements in an array : ");
    scanf("%d",&n);
    printf("Enter array elements in sorted manner: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the element to search : ");
    scanf("%d",&x);
    start=0,end=n-1;
    while(start<=end){
    mid=(start+end)/2;
    if(a[mid]==x){
    printf("Element %d found at index %d ",x,mid+1);
    break;
    }
    else if(x<a[mid])
    end=mid-1;
    else if(x>a[mid])
    start=mid+1;
    }
    return 0;
}