#include<stdio.h>
#include<stdlib.h>
#define MAX 5

struct queue {
    int ele[MAX];
    int front;
    int rear;
} q;

// Enqueue
void enqueue(int x) {
    if (q.rear == MAX - 1) {
        printf("Queue Overflow\n");
        return;
    }

    if (q.front == -1)
        q.front = 0;

    q.rear++;
    q.ele[q.rear] = x;
    printf("%d inserted\n", x);
}

// Dequeue
void dque() {
    int temp;

    if (q.front == -1) {
        printf("Queue is empty\n");
        return;
    }

    temp = q.ele[q.front];

    if (q.front == q.rear) {
        q.front = q.rear = -1;
    }
    else {
        q.front++;
    }

    printf("Deleted element is %d\n", temp);
}

// Display
void disp() {
    int i;

    if (q.front == -1) {
        printf("Queue is empty\n");
    }
    else {
        printf("Queue elements are: ");
        for (i = q.front; i <= q.rear; i++) {
            printf("%d ", q.ele[i]);
        }
        printf("\n");
    }
}

// Main
int main() {
    int choice, value;

    q.front = q.rear = -1;   // Initialize queue

    while (1) {
        printf("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                enqueue(value);
                break;
            case 2:
                dque();
                break;
            case 3:
                disp();
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}