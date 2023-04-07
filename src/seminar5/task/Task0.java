package seminar5.task;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Task0 {
    private static final Map<Integer, String> passportToName = new HashMap<>();

    public static void run() {
        passportToName.put(123, "Ivanov");
        passportToName.put(1223, "Petrov");
        passportToName.put(1234, "Sidorov");
        passportToName.put(12355, "Ivanov");
        passportToName.put(1233, "Fedotov");

        System.out.println(passportToName);

        for (Map.Entry<Integer, String> entry : passportToName.entrySet()) {
            if (entry.getValue().equals("Ivanov")) {
                System.out.println(entry);
            }
        }
    }
}
