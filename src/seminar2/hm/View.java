package seminar2.hm;

import java.util.Arrays;

public class View {
    public static void main(String[] args) {
        int len = Task1.getArrayLength();
        int[] data = Task1.getRandomArray(len);
        Task1.BubbleSort(data);
        System.out.println(Arrays.toString(data));
        System.out.println("-----------------------------------------------------");
        Task2.getStudentsJournal();
    }
}
