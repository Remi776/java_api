package seminar3.task;

import java.util.*;

public class Task1 {
    static Random random = new Random();
    public static void getRandomList() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(random.nextInt(10));
        }
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);
    }
}
