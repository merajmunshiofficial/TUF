import java.util.*;

class Stack {
    // Queue
    private Queue<Integer> q;

    // Constructor
    public Stack() {
        q = new LinkedList<>();
    }

    // Push method
    public void Push(int x) {
        // Get size 
        int s = q.size();
        // Add element
        q.add(x);

        // Move elements before new element to back
        for (int i = 0; i < s; i++) {
            q.add(q.remove());
        }
    }

    // Pop method
    public int Pop() {
        // Get front element 
        int n = q.remove();
        // Return removed element
        return n;
    }

    // Top method
    public int Top() {
        // Return front element
        return q.peek();
    }

    // Return current size 
    public int Size() {
        // Return size
        return q.size();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(3);
        s.Push(2);
        s.Push(4);
        s.Push(1);

        // Output the top element of the stack
        System.out.println("Top of the stack: " + s.Top());

        // Output the size of the stack before removing an element
        System.out.println("Size of the stack before removing element: " + s.Size());

        // Output the element that is popped from the stack
        System.out.println("The deleted element is: " + s.Pop());

        // Output the top element of the stack after removing an element
        System.out.println("Top of the stack after removing element: " + s.Top());

        // Output the size of the stack after removing an element
        System.out.println("Size of the stack after removing element: " + s.Size());
    }
}
