package seminar4.hw;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void fullLinkedList(LinkedList<Integer> linkedList) {
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
    }

    public static void getReverse(LinkedList<Integer> linkedList) {
        Deque<Integer> reverseList = new ArrayDeque<>();
        for (int item : linkedList) {
            reverseList.addFirst(item);
        }
        System.out.println(reverseList);
    }
}
