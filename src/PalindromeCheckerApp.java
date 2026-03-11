import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC6: Combined Queue (FIFO) and Stack (LIFO) Validation
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 6.0 (Queue & Stack Integration)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC6 Logic: Queue and Stack ---
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to both structures
        for (char c : input.toCharArray()) {
            queue.add(c);  // FIFO
            stack.push(c); // LIFO
        }

        boolean isPalindrome = true;

        // Compare until queue is empty
        while (!queue.isEmpty()) {
            // poll() gets first char, pop() gets last char
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input word: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}