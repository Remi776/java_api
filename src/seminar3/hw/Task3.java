package seminar3.hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void findMinMaxMeanList() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("List length = ");
        int len = scanner.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            intList.add(random.nextInt(2, 50));
        }
        System.out.println(intList);

        int maxList = intList.get(0);
        int minList = intList.get(0);
        int result = 0;
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) > maxList) {
                maxList = intList.get(i);
            } else if (intList.get(i) < minList) {
                minList = intList.get(i);
            }
            result += intList.get(i);
        }

        int mean = (result + intList.get(0)) / len;

        System.out.printf("max = %d \nmin = %d \nmean = %d", maxList, minList, mean);
    }
}
