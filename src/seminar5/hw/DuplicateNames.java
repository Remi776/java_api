package seminar5.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DuplicateNames {
    private static List<String> employeesList = new ArrayList<>();
    private static final Map<String, Integer> employeeNamesMap = new HashMap<>();

    public static void printTextFile() {
        System.out.println(employeesList);
    }

    public static void readTextFile() {
        String fileName = "/Users/bukharskyroman/Documents/GB_first_term/Java/java_api/src/seminar5/hw/employees.txt";
        try {
            employeesList = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getMapFromList() {
        readTextFile();
        for (String fullName : employeesList) {
            String[] name = fullName.split(" ");
            employeeNamesMap.putIfAbsent(name[0], 0);
        }
    }

    public static void countIdenticalNames() {
        getMapFromList();
        for (String fullName : employeesList) {
            String[] name = fullName.split(" ");
            if (employeeNamesMap.containsKey(name[0])) {
                updateValue(employeeNamesMap, name[0]);
            }
        }
        System.out.println(employeeNamesMap);
    }

    public static void updateValue(Map<String, Integer> map, String key) {
        map.put(key, map.get(key) + 1);
    }


    public static void sort() {
        Map<String, Integer> result = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> entries = new LinkedList<>(employeeNamesMap.entrySet());
        entries.sort(comparator); // Comparator.comparing(o -> (o.getValue())) OR Map.Entry.comparingByValue()

        for (Map.Entry<String, Integer> entry: entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println(result);
    }

    static Comparator<Map.Entry<String, Integer>> comparator = (o1, o2) -> o1.getValue().compareTo(o2.getValue());

}
