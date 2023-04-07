package seminar4;

import seminar4.task.OurNewStack;
import seminar4.task.Task0;
import seminar4.task.Task1;
import seminar4.task.Task3;

public class Main {
    public static void main(String[] args) {
        //Task0.getTime();
//        int[] data = {2, 3, 5, 1, 2, 4, 61, 1, 321};
//        Task3.pushInStack(data);
//        Task3.addInQueue(data);
//        Task3.addInDeque(data);
//        Task1.run();


        OurNewStack stack = new OurNewStack();
        stack.push(123);
        stack.push(45);
        stack.push(23);
        stack.push(12);
        stack.push(1);
        for (int i = 0; i < stack.getCapacity() - 1; i++) {
            System.out.println(stack.pop());
        }
//        for (int i = 0; i < stack.getCapacity() - 3 ; i++) {
//            System.out.println(stack.pop());
//        }
    }
}
