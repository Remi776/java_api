package seminar4.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task0 {
    private static int LENGTH = 1000000;

    public static void getTime() {
        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < LENGTH; i++) {
            intArrayList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = (endTime - startTime);

        System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intLinkedList.add(i);
        }
        long endTime2 = System.currentTimeMillis();

        result = (endTime2 - startTime2);
        System.out.printf("Run time for LinkedList: %s %s %n", result, "ms");
    }
}
