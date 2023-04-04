package seminar1.hw;

public class ex_2 {
    public static void prime_num() {
        boolean flag = true;
        int count = 0;
        System.out.print(" " + 2 + " ");
        for (int i = 3; i < 1000; i = i + 2) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            // Что-то типо "нормального/читаемого вывода"
            if (flag) {
                System.out.print(" " + i + " ");
                count += 1;
            } else flag = true;
            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
