package seminar4.hw;

import java.util.*;

public class Calculator {
    public static Scanner scan = new Scanner(System.in);

    public static int input() {
        System.out.print("Enter a number: ");
        int number = 0;
        try {
            number = scan.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Wrong number. Try again.");
        }
        return number;
    }

    public static char getOperator() {
        System.out.print("Enter ONE of the operators ('+', '-', '*', '/'): ");
        char operator = 0;
        try {
            operator = scan.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Wrong operator. Try again.");
        }
        return operator;
    }

    static Deque<Integer> resultList = new LinkedList<>();

    public static int calculate(int num1, int num2, char operator) {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                resultList.add(result);
                break;
            case '-':
                result = num1 - num2;
                resultList.add(result);
                break;
            case '*':
                result = num1 * num2;
                resultList.add(result);
                break;
            case '/':
                result = num1 / num2;
                resultList.add(result);
                break;
            default:
                System.out.println("Error! Wrong operator.");
                result = calculate(num1, num2, getOperator());
        }
        return result;
    }

    public static void cancelTheLastOperation() {
        System.out.println("Cancel last operation?\n1. yes\t2. no");
        int cancel = scan.nextInt();
        if (cancel == 1) {
            resultList.pop();
            System.out.println(resultList.peek());
        }
    }
}
