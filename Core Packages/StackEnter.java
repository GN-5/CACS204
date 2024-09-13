import java.util.*;

public class StackEnter {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Scanner input = new Scanner(System.in);
        Integer choice = 1, search, offset;

        while (choice != 0) {

            System.out.println("Enter a number to push ");
            choice = input.nextInt();
            if (choice != 0) {
                stack.push(choice);
            }
        }

        System.out.println("Enter a number to search ");
        search = input.nextInt();

        offset = stack.search(search);
        System.out.println("Offset is " + offset);

        if (offset != -1) {
            for (Integer i = 0; i < offset; i++) {
                stack2.push(stack.pop());
            }
        } else {
            System.out.println("Element not found");
        }

        System.out.println(stack2);
        stack2.pop();

        for (Integer i = 0; i < offset - 1; i++) {

            stack.push(stack2.pop());
        }

        System.out.println(stack);

        input.close();
    }

}
