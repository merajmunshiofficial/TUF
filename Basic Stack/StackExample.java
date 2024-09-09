import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        // Create stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(10);
        System.out.println("Element pushed: 10");

        // Pop an element from the stack
        if (!stack.isEmpty()) {
            System.out.println("Element popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty, cannot pop.");
        }

        // Check the size of the stack
        System.out.println("Stack size: " + stack.size());

        // Check if the stack is empty
        System.out.println("Stack empty or not? " + (stack.isEmpty() ? "Yes" : "No"));

        // Peek at the top element of the stack
        if (!stack.isEmpty()) {
            System.out.println("Stack's top element: " + stack.peek());
        } else {
            System.out.println("Stack is empty, no top element.");
        }

        // Push more elements and print the stack
        stack.push(20);
        stack.push(30);
        printStack(stack);
    }

    // Function to print the stack
    public static void printStack(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }
}
