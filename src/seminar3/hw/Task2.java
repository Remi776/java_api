package seminar3.hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void delEvenNumbersFromList() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("List length = ");
        int len = scanner.nextInt();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> notEvenList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            evenList.add(random.nextInt(2,50));
        }
        System.out.println(evenList);

        for (int i = 0; i < evenList.size(); i++) {
            if (evenList.get(i) % 2 != 0) notEvenList.add(evenList.get(i));
        }
        System.out.println(notEvenList);
    }
}
