package seminar_1.hm;

public class ex_1 {
    public static void prime_num() {
        String prime_num = "2\t3\t";
        for (int i = 5; i < 1001; i = i + 2){
            for (int j = 2; j < Math.sqrt(i) + 1; j++){
                if (i % j == 0) break;
            }

        }

    }
}
