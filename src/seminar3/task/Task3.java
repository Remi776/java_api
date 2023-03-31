package seminar3.task;

import java.util.ArrayList;

public class Task3 {
    public static void delIntFromList() {
        ArrayList myList= new ArrayList<String>();
        myList.add(1);
        myList.add("слово");
        myList.add(23);
        myList.add("абобус");
        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) instanceof Integer) myList.remove(myList.get(i));
        }
        System.out.println(myList);
    }
}
