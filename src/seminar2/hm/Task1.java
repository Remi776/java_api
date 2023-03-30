package seminar2.hm;

import seminar2.task.Log;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger LOG = Log.log(Task1.class.getName());

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
