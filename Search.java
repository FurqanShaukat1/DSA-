import java.util.Stack;

public class Search {

    public static int searchElement(Stack<Integer> stack, int element) {

        int index = -1;
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int currentElement = stack.pop();
            tempStack.push(currentElement);
            if (currentElement == element) {
                index = tempStack.size() - 1;
            }
        }


        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return index;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        int element = 30;
        System.out.println("Element " + element + " is at index: " + searchElement(stack, element));
    }
}

