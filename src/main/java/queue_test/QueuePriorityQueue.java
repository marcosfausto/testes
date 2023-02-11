package queue_test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {
    public static void main(String args[]) {
        // Creating empty priority queue
        Queue<Integer> pQueue = new PriorityQueue<>();

        // Adding items to the pQueue
        // using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue);

        // Printing the top element of
        // the PriorityQueue
        System.out.println("first element: " + pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("printing and removing first element: " + pQueue.poll());

        System.out.println(pQueue);

        // Printing the top element again
        System.out.println("first element: " + pQueue.peek());

        System.out.println(pQueue.offer(35));

        System.out.println(pQueue);
    }
}
