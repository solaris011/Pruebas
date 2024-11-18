package es.codegym.task.pro.task13.task1327;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/* 
Obteniendo sin esperar en una cola
*/
public class Solution {

    public static Queue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('M', 'H', 'R', 'W', 'C', 'V', 'S', 'A', 'F', 'N', 'Z', 'B', 'W', 'K', 'O', 'U', 'G', 'P', 'I', 'E', 'T', 'X', 'L'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
