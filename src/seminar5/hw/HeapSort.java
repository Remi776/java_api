package seminar5.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    public static void run() {

        int[] randomArray = new int[16];
        Random random = new Random();

        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = random.nextInt(1, 20);
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(randomArray));

        BuildHeap(randomArray);
        System.out.print("\nFixed heap: ");
        System.out.println(Arrays.toString(randomArray));

        HeapSort(randomArray);
        System.out.print("\nSorted array: ");
        System.out.println(Arrays.toString(randomArray));
    }

    public static void HeapSort(int[] array) {
        BuildHeap(array);
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            getFixHeap(array, 0, i);
        }
    }

    public static void BuildHeap(int[] array) {
        int arrayLength = array.length;
        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            getFixHeap(array, i, arrayLength);
        }
    }

    public static void getFixHeap(int[] array, int root, int bound) {

        int firstChild = 2 * root + 1;
        int secondChild = firstChild + 1;
        int largest = root;

        if (firstChild < bound && (array[firstChild] > array[largest])) {
            largest = firstChild;
        }

        if (secondChild < bound && (array[secondChild] > array[largest])) {
            largest = secondChild;
        }

        if (root != largest) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;
            getFixHeap(array, largest, bound);
        }
    }
}

