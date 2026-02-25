#include<stdio.h>
#include<stdlib.h>
#define MAX 5
typedef struct Stack {
    int items[MAX];
    int top;
} Stack;
Stack s;
void push(int x);
void pop();
void display();
void push(int x) {
    if (s.top == MAX - 1) {
        printf("Stack Overflow\n");
        return;
    }
    s.top++;
    s.items[s.top] = x;
    printf("%d pushed to stack\n", x);
}
void pop() {
    if (s.top == -1) {
        printf("Stack Underflow\n");
        return;
    }
    printf("%d popped from stack\n", s.items[s.top]);
    s.top--;
}
void display() {
    if (s.top == -1) {
        printf("Stack is empty\n");
        return;
    }
    printf("Stack elements: ");
    for (int i = s.top; i >= 0; i--) {
        printf("%d ", s.items[i]);
    }
    printf("\n");
}
int main() {
    s.top = -1; // Initialize stack
    int choice, value;
    while (1) {
        printf("\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}

