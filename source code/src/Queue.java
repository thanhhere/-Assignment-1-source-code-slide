import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList<Object> queue = new LinkedList<>();


        queue.add("22");
        queue.add("4");
        queue.add("15");

        System.out.println("Current Stack: " + queue);


        String firstElement = queue.peek().toString();
        System.out.println("Top element: " + firstElement);


        String removedElement = queue.poll().toString();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Stack after removal: " + queue);


        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);

    }
}
