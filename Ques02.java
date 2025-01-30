import java.util.Scanner;

public class Ques_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Initialize the array
        int[] LA = {10, 20, 30, 40, 50, 60};

        // Prompt the user to enter the item to search
        System.out.print("Enter the item to search: ");
        int ITEM = sc.nextInt();

        // Search for the item in the array
        int index = -1;
        for (int i = 0; i < LA.length; i++) {
            if (LA[i] == ITEM) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Item found at index " + index);

            // Print two right neighbors
            if (index + 1 < LA.length) {
                System.out.print("Right neighbor(s): ");
                System.out.print(LA[index + 1]);
                if (index + 2 < LA.length) {
                    System.out.print(", " + LA[index + 2]);
                }
                System.out.println();
            } else {
                System.out.println("No right neighbor");
            }

            // Print two left neighbors
            if (index - 1 >= 0) {
                System.out.print("Left neighbor(s): ");
                System.out.print(LA[index - 1]);
                if (index - 2 >= 0) {
                    System.out.print(", " + LA[index - 2]);
                }
                System.out.println();
            } else {
                System.out.println("No left neighbor");
            }
        } else {
            System.out.println("Item not found in the array.");
        }
    }
}
