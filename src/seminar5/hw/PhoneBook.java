package seminar5.hw;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static Scanner scanner = new Scanner(System.in);
    private static Map<String, ArrayList<String>> phoneBookMap = new LinkedHashMap<>();

    public static void menu() {
        System.out.print("Phone book:\n1. add contact\t2. print Phone book\n");
        int userInput = scanner.nextInt();
        boolean flag = true;
        if (userInput == 1) {
            inputName();
            inputNumber();
            while (flag) {
                System.out.println("Add another number?\n1. yes\t 2. no\n");
                int userSecondPhoneInput = scanner.nextInt();
                if (userSecondPhoneInput == 1) {
                    inputNumber();
                } else {
                    flag = false;
                }
            }
        } else {
            System.out.println(phoneBookMap);
        }
    }

    public static void putContactInMap() {


    }

    public static void inputName() {
        System.out.println("Enter the full name: ex.(Иван Иванов)\n");
        String nameUser = scanner.nextLine();
    }

    public static void addPhoneNumberInList(ArrayList<String> phoneNumberList) {
        phoneNumberList.add(inputNumber());
    }

    public static void inputNumber() {
        System.out.print("Enter the phone number: ex.(+ 7 555 555 55 55)");
        String userNumber = scanner.nextLine();
    }
}
