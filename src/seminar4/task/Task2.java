//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.


package seminar4.task;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main() {
        Deque<String> userText = new ArrayDeque<>();
        boolean flag = true;

        while (flag){
            System.out.println("Enter: \n'print' or 'revert'");
            String stg = scanner.nextLine();
            if (stg.equalsIgnoreCase("print")){
                System.out.println(userText);
            } else if (stg.equalsIgnoreCase("revert")){
                System.out.println("Delete -> " + userText.pop());
            }else {
                userText.push(stg);
            }
        }
    }
}
