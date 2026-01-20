//Reverse digits of a number without using % and / operators
#include <stdio.h>
#include <string.h>

int main() {
    int num = 12345;
    char str[20];

    // convert number to string
    sprintf(str, "%d", num);

    // reverse string
    int i = 0, j = strlen(str) - 1;
    while (i < j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }

    printf("%s", str); // 54321
    return 0;
}
