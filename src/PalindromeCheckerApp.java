import java.util.Scanner;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC1: Welcome Message
 * UC2: Two-Pointer Validation (Optimized)
 * UC3: Transformation-Based Validation (Reversing)
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 3.0 (Transformation Logic)");
        System.out.println("====================================================");

        // --- UC3: Reverse String Based Palindrome Check ---
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Transformation: Iterate from the last character to the first.
        //
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        // Validation: Comparing original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("----------------------------------------------------");
        scanner.close();
    }
}