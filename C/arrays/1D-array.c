//Write a menu-driven C Program to implement the following using 1-D array: 
// a. Sum of even numbers 
// b. The sum of prime numbers 
#include <stdio.h>
int isPrime(int num) {
    if (num <= 1) 
    return 0;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) 
        return 0;
    }
    return 1;
}   
int main() {
    int choice, n, i;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter the elements of the array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    while (1) {
        printf("\nMenu:\n");
        printf("1. Sum of even numbers\n");
        printf("2. Sum of prime numbers\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int evenSum = 0;
                for (i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        evenSum += arr[i];
                    }
                }
                printf("Sum of even numbers: %d\n", evenSum);
                break;
            }
            case 2: {
                int primeSum = 0;
                for (i = 0; i < n; i++) {
                    if (isPrime(arr[i])) {
                        primeSum += arr[i];
                    }
                }
                printf("Sum of prime numbers: %d\n", primeSum);
                break;
            }
            case 3:
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}
