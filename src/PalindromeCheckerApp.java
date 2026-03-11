import java.util.Scanner;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC10: Normalization and Robust Validation
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 10.0 (Robust Normalization)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String rawInput = scanner.nextLine();

        // --- UC10 Logic: Normalization using Regular Expressions ---
        // [^a-zA-Z0-9] matches anything that is NOT a letter or a number
        String normalized = rawInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        int length = normalized.length();

        // Optimized comparison logic
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Raw Input: " + rawInput);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}