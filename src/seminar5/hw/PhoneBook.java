package seminar5.hw;

import java.util.*;

public class PhoneBook {
    public static Scanner scanner = new Scanner(System.in);
    private static final Map<String, ArrayList<String>> phoneBookMap = new LinkedHashMap<>();


    public static void run() {
        boolean flag = true;
        while (flag) {
            System.out.print("Phone book:\n1. add contact\t2. print Phone book\n");
            int userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                ArrayList<String> phoneNumberList = new ArrayList<>();
                scanner.nextLine();
                System.out.println("Enter the full name: ex.(Иван Иванов)");
                String name = input();
                System.out.print("Enter the phone number: ex.(+ 7 555 555 55 55)\n");
                String phoneNumber = input();
                addPhoneNumberInList(phoneNumberList, phoneNumber);
                putContactInMap(name, phoneNumberList);
                while (true) {
                    System.out.println("Add another number?\n1. yes\t 2. no");
                    userAnswer = scanner.nextInt();
                    if (userAnswer == 1) {
                        System.out.print("Enter the phone number: ex.(+ 7 555 555 55 55)\n");
                        scanner.nextLine();
                        phoneNumber = input();
                        addPhoneNumberInList(phoneNumberList, phoneNumber);
                        putContactInMap(name, phoneNumberList);
                    } else {
                        break;
                    }
                }
            } else {
                printInTheConsole();
                flag = false;
            }
        }
    }

    public static void printInTheConsole() {
        int userID = 0;
        for (Map.Entry<String, ArrayList<String>> entry : phoneBookMap.entrySet()) {
            System.out.println(userID + " " + entry.getKey() + ", " + entry.getValue());
            userID += 1;
        }
    }

    public static String input() {
        String userInput = null;
        try {
            userInput = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid character.");
        }
        return userInput;
    }


    public static void addPhoneNumberInList(ArrayList<String> arrayList, String number) {
        arrayList.add(number);
    }

    public static void putContactInMap(String name, ArrayList<String> arrayList) {
        phoneBookMap.put(name, arrayList);
    }
}
