package seminar4.hw;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int a = Calculator.input();
            int b = Calculator.input();
            char operator = Calculator.getOperator();
            int result = Calculator.calculate(a, b, operator);
            System.out.println("Result = " + result);
            Calculator.cancelTheLastOperation();
            System.out.print("Close the calculator? 1.Yes 2.No\n");
            int exit = scanner.nextInt();
            if (exit == 1) flag = false;
        }
    }
}
