import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();


        stack.push("10");
        stack.push("3");
        stack.push("60");

        System.out.println("Current Stack: " + stack);


        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);


        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Stack after removal: " + stack);


        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);
    }
}
