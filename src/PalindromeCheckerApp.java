import java.util.Scanner;

/**
 * MAIN CLASS: PalindromeCheckerApp
 * UC4: Two-Pointer Validation using Character Array
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 4.0 (Two-Pointer Logic)");
        System.out.println("====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC4 Logic: Character Array & Two-Pointer ---
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Continue comparison until pointers cross in the middle
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}