import java.util.Scanner;
import java.util.Stack;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC5: Stack-Based Validation (LIFO Principle)
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 5.0 (Stack Data Structure)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC5 Logic: Using Stack ---
        Stack<Character> stack = new Stack<>();

        // 1. Push all characters into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // 2. Compare original characters with popped characters (Reverse Order)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Display Result
        System.out.println("Input text: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}