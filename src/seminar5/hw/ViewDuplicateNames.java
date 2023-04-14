package seminar5.hw;

public class ViewDuplicateNames {
    public static void main(String[] args) {
        DuplicateNames.readTextFile();
        DuplicateNames.printTextFile();
        System.out.print("\nNumber of duplicate names: ");
        DuplicateNames.countIdenticalNames();
        System.out.print("\nSorted: ");
        DuplicateNames.sort();

    }
}
