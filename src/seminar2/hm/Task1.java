package seminar2.hm;

import seminar2.task.Log;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    private static final Logger LOG = Log.log(Task1.class.getName());

    //    Log log = new Log();
    //    private static final String TAG = "Task1";
    public static int getArrayLength() {
        System.out.print("length of array = ");
        int len;
        len = scanner.nextInt();
        return len;
    }
    public static int[] getRandomArray(int len) {
        Random rand = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = rand.nextInt(50);
        }
        return array;
    }

    public static void BubbleSort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            LOG.log(Level.INFO, Arrays.toString(mas));
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] > mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
            LOG.log(Level.INFO, Arrays.toString(mas));
        }
    }
}
