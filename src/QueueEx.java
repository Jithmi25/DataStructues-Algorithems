import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    // ---------- PART B : Queue using Array ----------
    static class ArrayQueue {
        int size = 5;                  // Maximum size of the queue
        int front = 0;                 // Points to first element
        int rear = -1;                 // Points to last element
        String[] queue = new String[size];

        // Add element to queue
        void enqueue(String value) {
            if (rear == size - 1) {    // Overflow condition
                System.out.println("Array Queue is full");
            } else {
                rear++;                // Move rear forward
                queue[rear] = value;   // Insert element
                System.out.println(value + " added to Array Queue");
            }
        }

        // Remove element from queue
        void dequeue() {
            if (front > rear) {        // Underflow condition
                System.out.println("Array Queue is empty");
            } else {
                System.out.println(queue[front] + " removed from Array Queue");
                front++;               // Move front forward
            }
        }

        // Display queue elements
        void display() {
            if (front > rear) {
                System.out.println("Array Queue is empty");
            } else {
                System.out.print("Array Queue elements: ");
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                System.out.println();
            }
        }
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) {

        // ---------- PART A : Queue using Java Collection ----------
        Queue<String> queue = new LinkedList<>();

        // I. Add A, B, C, D to the queue
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        // Print the queue
        System.out.println("Queue: " + queue);

        // II. Print first node in the queue
        System.out.println("First node: " + queue.peek());

        // III. Delete A and B from the queue
        queue.remove();   // Removes A
        queue.remove();   // Removes B

        // Print queue after deletion
        System.out.println("Queue after deleting A and B: " + queue);

        // IV. Print first node again
        System.out.println("First node after deletion: " + queue.peek());

        // ---------- PART B : Queue using Array ----------
        System.out.println("\n--- Array Queue Implementation ---");

        ArrayQueue aq = new ArrayQueue();

        // Add elements to array queue
        aq.enqueue("A");
        aq.enqueue("B");
        aq.enqueue("C");

        // Display array queue
        aq.display();

        // Remove elements from array queue
        aq.dequeue();
        aq.dequeue();

        // Display again
        aq.display();
    }
}
