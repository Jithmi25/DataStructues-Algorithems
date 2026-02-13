//PriorityQueue

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

        // Create a PriorityQueue
        Queue<String> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add("Hello");
        pq.add("to");
        pq.add("Programming");

        // Print initial queue
        System.out.println("Initial Queue: " + pq);

        // Remove a specific element
        pq.remove("Hello");
        System.out.println("After Remove: " + pq);

        // Poll removes and returns the head element
        System.out.println("Poll Method: " + pq.poll());

        // Print final queue
        System.out.println("Final Queue: " + pq);
    }
}
