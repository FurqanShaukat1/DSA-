import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ques03 {
    public static void main(String[] args) {
        // Part (a): Finding one repeated integer
        System.out.println("Part (a): Finding one repeated integer");
        int[] A = {1, 2, 3, 4, 5, 6, 3}; // Example array
        findSingleDuplicate(A);

        // Part (b): Finding five repeated integers
        System.out.println("\nPart (b): Finding five repeated integers");
        int[] B = {1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6}; // Example array
        findMultipleDuplicates(B);
    }

    // Function to find a single repeated integer
    public static void findSingleDuplicate(int[] array) {
        int n = array.length;
        boolean[] seen = new boolean[n];

        for (int num : array) {
            if (seen[num]) {
                System.out.println("Repeated integer: " + num);
                return;
            }
            seen[num] = true;
        }
        System.out.println("No repeated integer found.");
    }

    // Function to find multiple repeated integers
    public static void findMultipleDuplicates(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Repeated integers:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (repeated " + entry.getValue() + " times)");
            }
        }
    }
}
