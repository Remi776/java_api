//1) Написать метод, который принимает массив элементов,
//        помещает их в стэк и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов,
//        помещает их в очередь и выводит на консоль содержимое очереди.

package seminar4.task;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task3 {
    public static void pushInStack(int[] array) {
        Stack<Integer> stackArray = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stackArray.push(array[i]);
        }
        System.out.println(stackArray);
    }

    public static void addInQueue(int[] array) {
        Queue<Integer> queueArray = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queueArray.add(array[i]);
        }
        System.out.println(queueArray);
    }
    public static void addInDeque(int[] array) {
        Deque<Integer> dequeArray = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            dequeArray.push(array[i]);
        }
        System.out.println(dequeArray);
    }
}
