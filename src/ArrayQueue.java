public class ArrayQueue<E> {
    private E[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queueArray = (E[]) new Object[capacity];
        this.front = 0;
        this.rear = -1; // rear points to the last element added
        this.currentSize = 0;
    }

    // Method to add an element to the queue
    public void enqueue(E item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment for rear
        queueArray[rear] = item;
        currentSize++;
        System.out.println(item + " enqueued to queue");
    }

    // Method to remove an element from the queue
    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        E item = queueArray[front];
        queueArray[front] = null; // Optional: nullify the removed element
        front = (front + 1) % capacity; // Circular increment for front
        currentSize--;
        System.out.println(item + " dequeued from queue");
        return item;
    }

    // Method to view the front element without removing it
    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return null;
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return currentSize == capacity;
    }

    // Method to get the current size of the queue
    public int size() {
        return currentSize;
    }

    // Main method for testing
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element after dequeues: " + queue.peek());

        queue.enqueue(60);
        queue.enqueue(70); // This will cause "Queue is full" if capacity is 5

        System.out.println("Queue size: " + queue.size());
    }
}