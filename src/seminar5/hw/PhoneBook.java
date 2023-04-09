package seminar5.hw;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static Scanner scanner = new Scanner(System.in);
    private static Map<String, ArrayList<String>> phoneBookMap = new LinkedHashMap<>();
    private static ArrayList<String> phoneNumberList = new ArrayList<>();

    public static void menu() {
        boolean flag = true;
        while (flag) {
            System.out.print("Phone book:\n1. add contact\t2. print Phone book\n");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Enter the full name: ex.(Иван Иванов)\n");
                String name = scanner.nextLine();
                System.out.print("Enter the phone number: ex.(+ 7 555 555 55 55)\n");
                String phoneNumber = scanner.nextLine();
                addPhoneNumberInList(phoneNumber);
                putContactInMap(name, phoneNumberList);
                while (flag) {
                    System.out.println("Add another number?\n1. yes\t 2. no\n");
                    userInput = scanner.nextInt();
                    if (userInput == 1) {
                        phoneNumber = scanner.nextLine();
                        addPhoneNumberInList(phoneNumber);
                        putContactInMap(name, phoneNumberList);
                    } else {
                        flag = false;
                    }
                }
            } else {
                System.out.println(phoneBookMap);
                flag = false;
            }
        }
    }

//    public static String inputName() {
//        System.out.println("Enter the full name: ex.(Иван Иванов)\n");
//        return scanner.nextLine();
//    }

//    public static String inputNumber() {
//        System.out.print("Enter the phone number: ex.(+ 7 555 555 55 55)\n");
//        return scanner.nextLine();
//    }

    public static void addPhoneNumberInList(String number) {
        phoneNumberList.add(number);
    }

    public static void putContactInMap(String name, ArrayList<String> list) {
        phoneBookMap.put(name, list);
    }
}
