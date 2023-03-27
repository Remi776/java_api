package seminar_1.hm;

public class ex_2 {
    public static void prime_num() {
        boolean flag = true;
        System.out.println(2);
        for (int i = 3; i < 1000; i = i + 2) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
            else flag = true;
        }
    }
}
