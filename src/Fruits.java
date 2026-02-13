// PriorityQueue

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class Fruits {
    public static void main(String[] args) {

        // Create a PriorityQueue
        Queue<String> pq = new PriorityQueue<>();

        // Add elements
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Orange");

        // Print initial queue
        System.out.println("Initial Queue: " + pq);

        // Remove a specific element
        pq.remove("Apple");
        System.out.println("After Remove: " + pq);

        // Poll method
        System.out.println("Poll Method: " + pq.poll());

        // Final queue
        System.out.println("Final Queue: " + pq);

        // Iterate through the priority queue
        System.out.print("Elements using Iterator: ");
        Iterator<String> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
