import java.util.Stack;

/*
Stack class models and implements the Stack data structure.
The class is based on the basic principle of last-in-first-out.
In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek.
The class can also be referred to as the subclass of Vector
 */
public class MyStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 10; i++)
            stack.push(3 * i);

        // printing values of stack
        stack.forEach(item -> {
            System.out.print(item + "\t");
        });

        System.out.println("\nPop from top :: " + stack.pop()); // It will return last value inserted and then remove
                                                                // from
                                                                // the stck.

        System.out.println(stack.capacity()); // return the size of the stack.

    }
}
