import java.util.Stack;

public class peek {

    public static int peek(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek top element: " + peek(stack));
    }
}

