package seminar3.hw;

public class Task1 {
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }

        int[] arrayLeft = new int[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);

        int[] arrayRight = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);

        sortArray(arrayLeft);
        sortArray(arrayRight);

        mergeArray(array, arrayLeft, arrayRight);

        return array;
    }

    private static void mergeArray(int[] array, int[] arrayLeft, int[] arrayRight) {

        int positionLeft = 0;
        int positionRight = 0;

        for (int i = 0; i < array.length; i++) {
            if (positionLeft == arrayLeft.length) {
                array[i] = arrayRight[positionRight];
                positionRight++;
            } else if (positionRight == arrayRight.length) {
                array[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else if (arrayLeft[positionLeft] < arrayRight[positionRight]) {
                array[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else {
                array[i] = arrayRight[positionRight];
                positionRight++;
            }
        }
    }
}

