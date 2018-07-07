package IntermediateJavaTutorials.CollectionsAndListsAndDataStructures;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        System.out.printf("%s ", q.peek());
        System.out.println();

        q.poll();
        System.out.printf("%s ", q);
        System.out.println();
    }
}