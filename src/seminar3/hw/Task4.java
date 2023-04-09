package seminar3.hw;


import java.util.ArrayList;
import java.util.List;

public class Task4 {

    //    public static void arrayDifference(Integer[] array1, Integer[] array2) {
//        listOne = Arrays.asList(array1);
//        listTwo = Arrays.asList(array2);
//        listOne.removeAll(listTwo);
//        System.out.println(listOne);
//    }

    public static boolean checkArray(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    public static void arrayDifference(int[] arr1, int[] arr2) {

        List<Integer> diffList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!checkArray(arr2, arr1[i])) {
                diffList.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!checkArray(arr1, arr2[i])) {
                diffList.add(arr2[i]);
            }
        }
        System.out.println(diffList);
    }

    public static void arrayIntersection(int[] arr1, int[] arr2) {
        List<Integer> interList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (checkArray(arr2, arr1[i])) {
                interList.add(arr1[i]);
            }
        }
        System.out.println(interList);
    }
}
