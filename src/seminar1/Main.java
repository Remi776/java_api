package seminar1;
//import seminar_1.task.*;

import seminar1.hw.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        task_1.run();
//        int[] arr = new int[]{1, 4, 0, 1, 1, 1};
//        int a = task_2.run(arr);
//        System.out.println(a);
        System.out.println("Exercise 1");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Enter the length of triangle: ");
        int digit = scanner.nextInt();
        ex_1.triangular_number(digit);
        ex_1.factorial(digit);
        System.out.println("\n-------------------------------------------------------------------------------------------");
        System.out.println("Exercise 2");
        System.out.println("-------------------------------------------------------------------------------------------");
        ex_2.prime_num();
        System.out.println("\n-------------------------------------------------------------------------------------------");
        System.out.println("Exercise 3");
        System.out.println("-------------------------------------------------------------------------------------------");
        boolean flag = true;
        while (flag){
            int num1 = ex_3.input();
            int num2 = ex_3.input();
            char operator = ex_3.getOperator();
            int result = ex_3.calculate(num1, num2, operator);
            System.out.println("result: " + result);
            System.out.print("Close the calculator? 1.Yes 2.No\n");
            int close_num = scanner.nextInt();
            if (close_num == 1) flag = false;
        }
    }
}


