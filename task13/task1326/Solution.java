package es.codegym.task.pro.task13.task1326;

import java.util.Queue;

/* 
Entra en la cola!
*/

public class Solution {

    public static void main(String[] args) {
        Queue<String> queue = new MyQueue();

        for (int i = 0; i < 10; i++) {
            queue.offer("Element " + i);
        }
        System.out.println("Queue length: " + queue.size());

        System.out.println("*** iterator ***");
        for (Object o : queue) {
            System.out.println(o);
        }

        System.out.println("*** peek ***");

        System.out.println(queue.peek());


        System.out.println("*** poll ***");

        System.out.println(queue.poll());
        }

        System.out.println("Queue length: " + queue.size());
    }
}
