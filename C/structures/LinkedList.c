#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* next;
} Node;

struct Node* head = NULL;

// Display function
void display() {
    struct Node* temp = head;

    if (temp == NULL) {
        printf("List is empty\n");
        return;
    }

    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main() {
    struct Node *x, *y, *z;

    x = (struct Node*)malloc(sizeof(struct Node));
    x->data = 10;
    x->next = NULL;
    head = x;

    y = (struct Node*)malloc(sizeof(struct Node));
    y->data = 20;
    y->next = NULL;
    x->next = y;

    z = (struct Node*)malloc(sizeof(struct Node));
    z->data = 30;
    z->next = NULL;
    y->next = z;

    // Call display function
    display();

    return 0;
}
