package day42_a_collection.queue;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // I can use .add method here because this comes from the Collection method
        // it does not sort it
        // insertion is not kept

        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1); // duplicates are allowed
        // queue.add(null); null is NOT allowed
       // System.out.println(queue.get(0)); get(index) ; comes from List interface, that is why I am not able to use it and there is no relation between queue and List
        System.out.println(queue); // [1, 1, 8, 10, 2]

        queue.offer(30);
        System.out.println(queue); // [1, 1, 8, 10, 2, 30]

        System.out.println(queue.poll()); // 1: shows which one was removed - this one removes the first item (FIFO)
        System.out.println(queue); // [1, 2, 8, 10, 30]
        System.out.println(queue.peek()); // 1: FIFO --> first one ready to be removed

    }

}
