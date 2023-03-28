package seminar1.hm;

public class ex_1 {
    public static void triangular_number(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(j + " ");
                    count += j;
                    break;
                }
                System.out.print(j + " + ");
                count += j;
            }
            System.out.printf("= %d\n", count);
            count = 0;
        }
    }

    public static void factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.printf("%d! = %d", number, result);
    }
}
