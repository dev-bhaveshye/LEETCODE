package DSA;

import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        // Creating a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Insert elements (enqueue)
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.offer(20); // offer() is similar to add()

        System.out.println("Priority Queue after insertion: " + pq);

        // 2. Peek (see the smallest element without removing it)
        System.out.println("Peek (head of queue): " + pq.peek());

        // 3. Remove (dequeue) the smallest/highest priority element
        System.out.println("Removed element (poll): " + pq.poll());

        // 4. After one removal
        System.out.println("Priority Queue after poll(): " + pq);

        // 5. Size of the queue
        System.out.println("Size of Priority Queue: " + pq.size());

        // 6. Check if the queue contains a specific element
        System.out.println("Contains 30? " + pq.contains(30));

        // 7. Remove a specific element
        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        // 8. Check if queue is empty
        System.out.println("Is the queue empty? " + pq.isEmpty());

        // 9. Clear all elements
        pq.clear();
        System.out.println("Queue after clear(): " + pq);

        // Add some elements
        pq.add(50);
        pq.add(10);
        pq.add(40);
        pq.add(30);
        pq.add(20);

        System.out.println("Initial Priority Queue: " + pq);

        // 1. poll() - removes and returns the head (smallest element)
        int polled = pq.poll();
        System.out.println("poll() - removed element: " + polled);
        System.out.println("After poll(): " + pq);

        // 2. remove() - removes the head (like poll but throws exception if empty)
        int removed = pq.remove();  // throws NoSuchElementException if empty
        System.out.println("remove() - removed element: " + removed);
        System.out.println("After remove(): " + pq);

        // 3. remove(Object o) - removes a specific element
        boolean isRemoved = pq.remove(Integer.valueOf(30));
        System.out.println("remove(30): " + isRemoved);
        System.out.println("After removing 30: " + pq);

        // 4. contains(Object o) - checks if an element exists
        System.out.println("contains(20): " + pq.contains(20));
        System.out.println("contains(100): " + pq.contains(100));

        // 5. isEmpty() - checks if queue is empty
        System.out.println("Is queue empty? " + pq.isEmpty());
        
        // 6. clear() - removes all elements
        pq.clear();
        System.out.println("After clear(): " + pq);
        System.out.println("Is queue empty after clear()? " + pq.isEmpty());
    }
}
