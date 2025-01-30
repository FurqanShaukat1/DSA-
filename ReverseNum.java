import java.util.Stack;

public class ReverseNum {

    public static int reverseNumber(int num) {
        Stack<Integer> stack = new Stack<>();

        while (num != 0) {
            stack.push(num % 10);
            num /= 10;
        }

        int reversedNum = 0;
        int place = 1;
        while (!stack.isEmpty()) {
            reversedNum += stack.pop() * place;
            place *= 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed Number: " + reverseNumber(num));
    }
}

