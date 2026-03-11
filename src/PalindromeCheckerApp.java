import java.util.Scanner;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC9: Recursive Palindrome Validation
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 9.0 (Recursive Implementation)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC9 Logic: Recursion ---
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }

    /**
     * Recursive helper method
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: Single char or empty range is always a palindrome
        if (start >= end) {
            return true;
        }

        // Logical Comparison
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: shrink the problem
        return check(s, start + 1, end - 1);
    }
}