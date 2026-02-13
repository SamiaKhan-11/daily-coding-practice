//to insert/delete an element in/from a 1D array at a particular position
#include<stdio.h>
// void main(){
//     int n, e, k, i;
//     printf("Enter number of elements in the array: ");
//     scanf("%d", &n);
//     int arr[n]; 
//     printf("Enter array elements:\n");
//     for(i = 0; i < n; i++) {
//         scanf("%d", &arr[i]);
//     }
//     printf("Enter the element to be inserted: ");
//     scanf("%d", &e);    
//     printf("Enter the position to insert the element: ");
//     scanf("%d", &k);
//     for(i = n; i > k; i--) {
//         arr[i] = arr[i - 1];
//     }
//     arr[k] = e;
//     n++;
//     printf("Array after insertion:\n");
//     for(i = 0; i < n; i++) {
//         printf("%d ", arr[i]);
//     }
//     printf("\n");
// }

#include <stdio.h>

int main() {
    int n, k, i;

    printf("Enter number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter array elements:\n");
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the position to delete the element from: ");
    scanf("%d", &k);

    // Shift elements to the left
    for(i = k - 1; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }

    n--; // Reduce array size

    printf("Array after deletion:\n");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
