package seminar_1;
import seminar_1.task.*;

public class Main {
    public static void main(String[] args) {
        task_1.run();
        int[] arr = new int[]{1, 4, 0, 1, 1, 1};
        int a = task_2.run(arr);
        System.out.println(a);
    }
}
