//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя строку вида
//        text:num
//        2. Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
//        3. Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.


package seminar4.task;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> userTextList = new LinkedList<>();
        while (true) {
            System.out.print("1. Enter a text:number format string\n" +
                    "if you want to add text in List[number].\n" +
                    "2. Enter a print:number format string\n" +
                    "if wou want to print to the console.\n" +
                    "3. To exit, enter exit\n");

            String userInput = scanner.nextLine();
            String[] userInputArray = userInput.split(":");

            if (userInputArray.length > 1 && isNumeric(userInputArray[1])) {
                int position = Integer.parseInt(userInputArray[1]);
                if (position > userTextList.size()) {
                    for (int i = 0; i < position; i++) {
                        userTextList.add(null);
                    }
                }
                if (position >= 0) {
                    if (userInputArray[0].equals("print")) {
                        System.out.println(userTextList.get(position));
                        userTextList.remove(position);
                    } else {
                        userTextList.add(position, userInputArray[0]);
                    }
                }
            }
            if (Objects.equals(userInput, "exit")) {
                break;
            }
        }
    }

    public static boolean isNumeric(String stringNumber) {
        if (stringNumber == null) {
            return false;
        }
        try {
            Integer.parseInt(stringNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
