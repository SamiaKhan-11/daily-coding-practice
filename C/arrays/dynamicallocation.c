#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p, i, n;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    /* malloc */
    p = (int *)malloc(n * sizeof(int));
    printf("Enter elements using malloc:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &p[i]);

    /* realloc */
    p = (int *)realloc(p, (n + 2) * sizeof(int));
    printf("Enter 2 more elements:\n");
    for (i = n; i < n + 2; i++)
        scanf("%d", &p[i]);

    /* calloc */
    p = (int *)calloc(n, sizeof(int));
    printf("Elements after calloc:\n");
    for (i = 0; i < n; i++)
        printf("%d ", p[i]);

    /* free */
    free(p);

    return 0;
}
