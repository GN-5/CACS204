import java.util.*;

class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped Element is " + stack.pop());

        System.out.println("Top of stack is " + stack.peek());

        System.out.println(stack);

    }

}
