package seminar2.hm;

import java.util.Arrays;
import java.util.Random;

public class View {
    public static void main(String[] args) {
        int[] data = {2, 3, 8, 1, 4, 2, 3, 10, 123, 54, 23};
        Task1.BubbleSort(data);
        System.out.println(Arrays.toString(data));
    }
}
