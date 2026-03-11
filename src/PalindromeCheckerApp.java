import java.util.Scanner;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC13: Performance Benchmarking and Robust Validation
 */// Verified Clone
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 13.0 (Performance Benchmarking)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // --- UC13 Logic: Performance Measurement ---
        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Results Output
        System.out.println("----------------------------------------------------");
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
        System.out.println("----------------------------------------------------");

        scanner.close();
    }

    /**
     * Optimized algorithm including normalization
     */
    private static boolean checkPalindrome(String str) {
        if (str == null) return false;

        // Normalization
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
