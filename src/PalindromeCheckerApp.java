import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC7: Optimized Deque-Based Validation
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 7.0 (Deque Optimization)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC7 Logic: ArrayDeque ---
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the end of the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare by removing from both ends simultaneously
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}