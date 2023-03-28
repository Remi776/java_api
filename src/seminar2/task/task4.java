package seminar2.task;

import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void writeInFile() {
        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(buildString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String buildString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
        }
        return builder.toString();
        // return "TEST".repeat(100);
    }
}
