package seminar1.hw;

import java.util.Scanner;

public class ex_3 {
    static Scanner scan = new Scanner(System.in);

    public static int input() {
        System.out.print("Enter a number: ");
        int number = 0;      // Почему мне не дает объявить просто переменную int number; ? Требует обязательно присвоить значение. Я же присваиваю значение ниже в цикле...
        if (scan.hasNextInt()) number = scan.nextInt();
        else System.out.println("Wrong number. Try again.");
        return number;
    }

    public static char getOperator() {
        System.out.print("Enter ONE of the operators ('+', '-', '*', '/'): ");
        char oper = 0;
        if (scan.hasNext()) oper = scan.next().charAt(0);
        else System.out.println("Wrong operator. Try again.");
        return oper;
    }

    public static int calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Wrong operator.");
                result = calculate(num1, num2, getOperator());
        }
        return result;
    }
}