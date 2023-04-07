package seminar4.hw;

import java.util.LinkedList;

public class View {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        ReverseLinkedList.fullLinkedList(myList);
        ReverseLinkedList.getReverse(myList);
    }
}
