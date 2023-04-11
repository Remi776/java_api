package seminar5.hw;

import java.util.ArrayList;
import java.util.Random;

public class HeapSort {
    public static void run() {

        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int index = 1; index <= 7; index++) {
            randomList.add(random.nextInt(1, 50));
        }
        System.out.println(randomList);

        int listSize = randomList.size();
        for (int i = randomList.size() / 2; i >= 0; i--) {
            getFixHeap(randomList, i, randomList.get(i), listSize);
        }
        System.out.println(randomList);
    }

    private static void getFixHeap(ArrayList<Integer> arrayList, int root, int key, int bound) {
        int vacant = root;
        while (2 * vacant <= bound) {

            int firstChild = 2 * vacant;
            int secondChild = firstChild + 1;
            int temp;

            if (firstChild < bound && (arrayList.get(firstChild) > arrayList.get(secondChild))){
                temp = firstChild + 1;
            }
            if (secondChild < bound && (arrayList.get(firstChild) < arrayList.get(firstChild))){
                temp = firstChild + 1;
            }

            if (key > arrayList.get(temp)){
                break;
            } else {
                arrayList.add(vacant, arrayList.get(temp));
                vacant = temp;
            }
        }
        arrayList.add(vacant, key);
    }
}
