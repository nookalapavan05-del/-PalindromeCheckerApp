/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================
 * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using an object-oriented design.
 * The logic is encapsulated within a PalindromeService class. [cite: 5]
 */
public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the service class
        PalindromeService service = new PalindromeService();

        // Example Input: racecar
        String input = "racecar";

        System.out.println("Input: " + input);

        // Use the encapsulated method to check the string
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome?");
        System.out.println(result); [cite: 6, 7]
    }
}

/**
 * Service class that contains palindrome logic. [cite: 5]
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome. [cite: 5]
     * Uses a two-pointer approach (start and end). [cite: 5]
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers [cite: 5]
        int start = 0;
        int end = input.length() - 1;

        // Logic to compare characters from both ends [cite: 5]
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}