package seminar4.hw;

import java.util.LinkedList;

public class LinkedListQueue {

    public static void enqueue(LinkedList<Integer> list, int item) {
        list.addLast(item);
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}

