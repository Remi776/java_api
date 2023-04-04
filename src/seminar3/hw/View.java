package seminar3.hw;


import java.util.Arrays;

public class View {
    public static void main(String[] args) {
        int len = TaskTEST.getArrayLength();
        int[] data = TaskTEST.getRandomArray(len);
        System.out.print("Array: ");
        System.out.println(Arrays.toString(data));
        Task1.sortArray(data);
        System.out.print("Sort Array: ");
        System.out.println(Arrays.toString(data));
        System.out.println("-----------------------------------------------------------------------");
        Task2.delEvenNumbersFromList();
        System.out.println("-----------------------------------------------------------------------");
        Task3.findMinMaxMeanList();
        System.out.println("\n-----------------------------------------------------------------------");
        int[] data1 = {1, 3, 5};
        int[] data2 = {3, 5, 6, 7};
        System.out.print("array1: ");
        System.out.println(Arrays.toString(data1));
        System.out.print("array2: ");
        System.out.println(Arrays.toString(data2));
        System.out.print("intersection: ");
        Task4.arrayIntersection(data1, data2);
        System.out.print("difference: ");
        Task4.arrayDifference(data1, data2);

    }
}

