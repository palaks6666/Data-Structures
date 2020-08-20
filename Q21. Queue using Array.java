import java.util.*;
class Queue {
    static int rear, front, maxSize;
    static int queue[];
    Queue(int s) {
        front = 0;
        rear = 0;
        maxSize = s;
        queue = new int[maxSize];
    }
    static void enq(int data) {
        if (rear == maxSize) {
            System.out.printf("queue is overflow\n");
            return;
        } else {

            queue[rear] = data;
            rear++;
        }
        return;
    }
    static void deq() {
        if (front == rear) {
            System.out.printf("queue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < maxSize) {
                queue[rear] = 0;
                rear--;
            }
            return;
        }

    }
    static void printQueue() {
        if (rear == front) {
            System.out.printf("queue is empty\n");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.printf("%d   ", queue[i]);
        }
        return;
    }
}
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.printQueue();
        q.enq(20);
        q.enq(80);
        q.enq(34);
        q.enq(12);
        q.printQueue();
        q.enq(21);
        System.out.println("\nAfter Adding");
        q.printQueue();
        q.deq();
        q.deq();
        System.out.println("\nAfter deletion");
        q.printQueue();

    }
}
