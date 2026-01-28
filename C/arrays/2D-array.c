//Write a menu-driven C Program to implement the following in a 2-D array: 
// a. Addition of two 2-D arrays 
// b. The row-wise sum of elements 
#include <stdio.h>
int main() {
    int choice, i, j, r, c;

    printf("Enter number of rows: ");
    scanf("%d", &r);
    printf("Enter number of columns: ");
    scanf("%d", &c);

    int arr1[r][c], arr2[r][c], sum[r][c];

    while (1) {
        printf("\nMenu:\n");
        printf("1. Addition of two 2-D arrays\n");
        printf("2. Row-wise sum of elements\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter elements of first array:\n");
                for (i = 0; i < r; i++) {
                    for (j = 0; j < c; j++) {
                        scanf("%d", &arr1[i][j]);
                    }
                }

                printf("Enter elements of second array:\n");
                for (i = 0; i < r; i++) {
                    for (j = 0; j < c; j++) {
                        scanf("%d", &arr2[i][j]);
                    }
                }

                // Adding the two arrays
                for (i = 0; i < r; i++) {
                    for (j = 0; j < c; j++) {
                        sum[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }

                printf("Sum of the two arrays:\n");
                for (i = 0; i < r; i++) {
                    for (j = 0; j < c; j++) {
                        printf("%d ", sum[i][j]);
                    }
                    printf("\n");
                }
                break;

            case 2:
                printf("Enter elements of the array:\n");
                for (i = 0; i < r; i++) {
                    for (j = 0; j < c; j++) {
                        scanf("%d", &arr1[i][j]);
                    }
                }

                printf("Row-wise sum of elements:\n");
                for (i = 0; i < r; i++) {
                    int rowSum = 0;
                    for (j = 0; j < c; j++) {
                        rowSum += arr1[i][j];
                    }
                    printf("Sum of row %d: %d\n", i + 1, rowSum);
                }
                break;
            case 3:
                printf("Exiting the program.\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }   
    return 0;
}
