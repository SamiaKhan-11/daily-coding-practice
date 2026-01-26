#include<stdio.h>
#include<stdlib.h>
#define MAX 100
typedef struct {
    int row;
    int col;
    int value;
} Element;
typedef struct {
    int rows;
    int cols;
    int numElements;
    Element elements[MAX];
} SparseMatrix;
SparseMatrix createSparseMatrix(int rows, int cols, int numElements) {
    SparseMatrix sm;
    sm.rows = rows;
    sm.cols = cols;
    sm.numElements = numElements;
    for (int i = 0; i < numElements; i++) {
        printf("Enter row, column and value for element %d: ", i + 1);
        scanf("%d %d %d", &sm.elements[i].row, &sm.elements[i].col, &sm.elements[i].value);
    }
    return sm;
}
void displaySparseMatrix(SparseMatrix sm) {
    int k = 0;
    for (int i = 0; i < sm.rows; i++) {
        for (int j = 0; j < sm.cols; j++) {
            if (k < sm.numElements && sm.elements[k].row == i && sm.elements[k].col == j) {
                printf("%d ", sm.elements[k].value);
                k++;
            } else {
                printf("0 ");
            }
        }
        printf("\n");
    }
}
int main() {
    int rows, cols, numElements;
    printf("Enter number of rows, columns and non-zero elements: ");
    scanf("%d %d %d", &rows, &cols, &numElements);
    SparseMatrix sm = createSparseMatrix(rows, cols, numElements);
    printf("The sparse matrix is:\n");
    displaySparseMatrix(sm);
    return 0;
}