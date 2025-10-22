import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack of Strings
        Stack<String> stack = new Stack<>();

        // Adding (pushing) elements to the stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Programming");
        stack.push("Class");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Accessing (peeking) the top element of the stack
        System.out.println("The element at the top of the stack is: " + stack.peek());

        // Removing (popping) elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operations: " + stack);

        // Accessing all remaining elements using a for-each loop
        System.out.println("\nRemaining elements in the stack:");
        for (String element : stack) {
            System.out.println(element);
        }
    }
}
