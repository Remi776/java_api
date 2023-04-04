package seminar2.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task3 {
    private static final Logger LOG = Log.log(task3.class.getName()); // logger нацеливаем на task3

    public static void writeToFile(String path) {
        try (FileWriter in = new FileWriter("task3.txt")) {
            String[] data = getFileNamesInFolder(path);
            for (String datum : data) {
                in.append(datum);
            }
            LOG.log(Level.INFO, "Recorded.");
            //  throw new IOException("Error");
            //  System.out.println("Recorded.");
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static String[] getFileNamesInFolder(String path) {
        File dir = new File(path);
        String[] result = null;
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " not a directory");
        }
        return result;
    }
}
