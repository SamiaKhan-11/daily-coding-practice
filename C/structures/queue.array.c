#include<stdio.h>
#define MAX 5

int queue[MAX];
int front = -1;
int rear = -1;

// Enqueue
void enqueue(int x) {
    if (rear == MAX - 1) {
        printf("Queue Overflow\n");
        return;
    }

    if (front == -1)
        front = 0;

    rear++;
    queue[rear] = x;
    printf("%d inserted\n", x);
}

// Dequeue
void dque() {
    int temp;

    if (front == -1) {
        printf("Queue is empty\n");
        return;
    }

    temp = queue[front];

    if (front == rear) {
        front = rear = -1;
    }
    else {
        front++;
    }

    printf("Deleted element is %d\n", temp);
}

// Display
void disp() {
    int i;

    if (front == -1) {
        printf("Queue is empty\n");
    }
    else {
        printf("Queue elements are: ");
        for (i = front; i <= rear; i++) {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}

// Main
int main() {
    int choice, value;

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