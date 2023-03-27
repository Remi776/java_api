package seminar_1;
//import seminar_1.task.*;
import seminar_1.hm.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task_1.run();
//        int[] arr = new int[]{1, 4, 0, 1, 1, 1};
//        int a = task_2.run(arr);
//        System.out.println(a);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of triangle: ");
        int digit = scanner.nextInt();
        ex_1.triangular_number(digit);
        ex_1.factorial(digit);

        //ex_2.prime_num();


    }
}


