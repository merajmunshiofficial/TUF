import java.util.*;

class Queue {
    // Array to store queue elements
    private int[] arr;
    // Indices for start and end of the queue
    private int start, end;
    // Current size and maximum size of the queue
    private int currSize, maxSize;

    // Default constructor
    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
    }

    // Parameterized constructor
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    // Method to push an element into the queue
    public void push(int newElement) {
        // Check if the queue is full
        if (currSize == maxSize) {
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        // If the queue is empty, initialize start and end
        if (end == -1) {
            start = 0;
            end = 0;
        } else
            // Circular increment of end
            end = (end + 1) % maxSize;
        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currSize++;
    }

    // Method to pop an element from the queue
    public int pop() {
        // Check if the queue is empty
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[start];
        // If the queue has only one element, reset start and end
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else
            // Circular increment of start
            start = (start + 1) % maxSize;
        currSize--;
        return popped;
    }

    // Method to get the front element of the queue
    public int top() {
        // Check if the queue is empty
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }

    // Method to get the current size of the queue
    public int size() {
        return currSize;
    }

    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
