package seminar_1.task;

public class task_2 {
    //110111
    public static int run(int[] array) {
        int count = 0;
        int max_count = 0;
        for (int item : array) {
            if (item == 1) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                }
                count = 0;
            }
        }
        return max_count;
    }
}
