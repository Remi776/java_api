package seminar3.hw;

import java.util.Random;
import java.util.Scanner;


public class TaskTEST {
    public static int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
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
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length< 2) {
            return array;
        }

        int[] arrayA = new int[array.length / 2];
        System.arraycopy(array, 0, arrayA, 0, array.length / 2);

        int[] arrayB = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayB, 0, array.length - array.length / 2);

        arrayA = sortArray(arrayA);
        arrayB = sortArray(arrayB);

        return mergeArray(arrayA, arrayB);
    }

    public static int[] mergeArray(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }
}
