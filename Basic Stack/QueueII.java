import java.util.*;

// Node structure
class Node {
    int data;
    Node next;
}

// Queueii class
 class Queueii {
    Node start;
    Node end;
    int count;

    // Constructor to initialize the Queueii
    Queueii() {
        start = end = null;
        count = 0;
    }

    // Function to add an element to the Queueii
    void push(int n) {
        // Create a new node
        Node temp = new Node();
        // Assign data
        temp.data = n;
        // Set next to null
        temp.next = null;

        if (start == null) {
            // Both start and end point to the new node
            start = end = temp;
        } else {
            // Link new node at the end of the Queueii
            end.next = temp;
            // Update end to the new node
            end = temp;
        }
        // Increment count
        count++;
    }

    // Function to remove an element from the Queueii
    int pop() {
        // If Queueii is empty
        if (start == null) {
            System.out.println("Queueii is empty");
            return -1; // Return error code
        }
        // Store the front node
        Node temp = start;
        // Get data from front node
        int data = temp.data;
        // Move start to the next node
        start = start.next;
        // Delete the old front node
        temp = null;
        // Decrement count
        count--;

        // If Queueii is now empty
        if (start == null) {
            end = null;
        }

        return data;
    }

    // Function to get the front element of the Queueii
    int peek() {
        if (start == null) {
            System.out.println("Queueii is empty");
            return -1; // Return error code
        }
        // Return front element
        return start.data;
    }

    // Function to get the size of the Queueii
    int size() {
        return count;
    }

    // Function to check if the Queueii is empty
    boolean isEmpty() {
        return start == null;
    }

    public static void main(String[] args) {
        Queueii q = new Queueii();

        // Add 10 to the Queueii
        q.push(10);

        // Add 20 to the Queueii
        q.push(20);

        // Add 30 to the Queueii
        q.push(30);

        // Output: 10 (front element)
        System.out.println(q.peek());

        // Output: 10 (remove front element)
        System.out.println(q.pop());

        // Output: 20 (new front element)
        System.out.println(q.peek());
    }
}
