package seminar5.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DuplicateNames {
    private static List<String> employeesList = new ArrayList<>();
    private static final HashMap<String, Integer> employeeNamesMap = new HashMap<>();

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

    public static void updateValue(HashMap<String, Integer> map, String key) {
        map.put(key, map.get(key) + 1);
    }

    public static void Sort() {
        for (entry:map.entrySet) {
            if (entry.getValues() > 1) {
                добавить в TreeMap entry.getKey, entry.getValue()
            }
        }
    }

}
