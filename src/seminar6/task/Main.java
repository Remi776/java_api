package seminar6.task;

import java.util.HashSet;
import java.util.Set;

// Клиентский код в Java - это типо класс Main().
public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Ivan Ivanov", "+7 789 798 65 74");
        Cat cat = new Cat(2, "Simba", true, "Насморк", owner);
        Cat cat2 = new Cat(2, "Simba", true, "Насморк", owner);
        System.out.println(cat);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        System.out.println(cats);
    }
}
