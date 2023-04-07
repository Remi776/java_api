package seminar4.hw;

import java.util.LinkedList;

public class View {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
//        ReverseLinkedList.fullLinkedList(myList);
//        ReverseLinkedList.getReverse(myList);

        LinkedListQueue.enqueue(myList, 5);
        LinkedListQueue.enqueue(myList, 8);
        LinkedListQueue.enqueue(myList, 3);
        LinkedListQueue.enqueue(myList, 1);
        LinkedListQueue.enqueue(myList, 11);
        System.out.println(myList);
        System.out.println(LinkedListQueue.first(myList));
        System.out.println(LinkedListQueue.dequeue(myList));
        System.out.println(myList);
    }
}
