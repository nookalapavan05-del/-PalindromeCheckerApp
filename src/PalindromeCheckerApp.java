/**
 * MAIN CLASS PalindromeCheckerApp
 * * Use Case 1: Welcome Message
 * Use Case 2: Hardcoded Palindrome Validation
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Application Entry & Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 2.0 (Logic Implementation)");
        System.out.println("System initialized successfully.");
        System.out.println("====================================================");

        // --- UC2: Hardcoded Palindrome Validation ---

        // Hardcoded string literal
        String input = "madam";
        boolean isPalindrome = true;

        // Efficient loop: Compare characters from both ends toward the middle
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }
        }

        // Displaying results
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");
    }