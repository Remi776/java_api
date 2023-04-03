package seminar3.hw;


import java.util.Arrays;

public class View {
    public static void main(String[] args) {
        int len = Task1.getArrayLength();
        int[] data = Task1.getRandomArray(len);
        System.out.println(Arrays.toString(data));
        Task1.sortArray(data);
        System.out.println(Arrays.toString(data));
        Task2.sortArray(data);
        System.out.println(Arrays.toString(data));

    }
}

