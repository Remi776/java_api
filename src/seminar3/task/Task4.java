package seminar3.task;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static List<ArrayList<String>> catalog = new ArrayList<>();
    public static void fillCatalog(ArrayList<String> books) {
        catalog.add(books);
        System.out.println(catalog);
    }
}
