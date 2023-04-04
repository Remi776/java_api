package seminar2.hw;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;


public class Task2 {
    private static final String TAG_SURNAME = "фамилия";
    private static final String TAG_MARK = "оценка";
    private static final String TAG_SUBJECT = "предмет";

    public static void getStudentsJournal() {
        try {
<<<<<<< HEAD
            Object obj = new JSONParser().parse(new FileReader("/Users/bukharskyroman/Documents/GB_first_term/Java/java_api/src/seminar2/hm/students.json"));  // при указании просто students.json выдает ошибку, почему?
=======
            Object obj = new JSONParser().parse(new FileReader("/Users/bukharskyroman/Documents/GB_first_term/Java/java_api/src/seminar2/hw/students.json"));  // при указании просто students.json выдает ошибку, почему?
>>>>>>> seminar3
            JSONArray students = (JSONArray) obj;
            for (Object it : students) {
                JSONObject array = (JSONObject) it;
                System.out.println("Студент " + array.get(TAG_SURNAME) + " получил " + array.get(TAG_MARK) + " по предмету " + array.get(TAG_SUBJECT) +".");
<<<<<<< HEAD
                ;
=======
>>>>>>> seminar3
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
