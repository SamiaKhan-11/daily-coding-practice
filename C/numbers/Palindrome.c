#include <stdio.h>
int main()
{
    int num, rev = 0, d, temp;
    printf("Enter a number : ");
    scanf("%d", &num);
    temp = num;
    while (num > 0)
    {
        d = num % 10;
        num = num / 10;
        rev = rev * 10 + d;
    }
    if (temp == rev)
    {
        printf("The number is palindrome : %d = %d", temp, rev);
    }
    else
        printf("Not a palindrome number");
    return 0;
}