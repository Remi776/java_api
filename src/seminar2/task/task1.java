package seminar2.task;

public class task1 {
    public static String getString(int n, char a, char b) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            str.append(a);
            str.append(b);
        }
        if (n % 2 != 0)str.append(a);
        return str.toString();
    }
}
