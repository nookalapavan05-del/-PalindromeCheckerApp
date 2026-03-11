import java.util.*;

/**
 * UC12: Strategy Design Pattern Implementation
 * Enables switching between different data structures at runtime.
 */

// 1. Define the Contract
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. Concrete Strategy: Stack (LIFO)
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        String clean = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

// 3. Concrete Strategy: Deque (Double-Ended)
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) return true;
        String clean = input.toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : clean.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// 4. Main Context Class
public class PalindromeCheckerApp {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void runValidation(String text) {
        if (strategy == null) {
            System.out.println("Error: No strategy selected!");
            return;
        }
        boolean result = strategy.check(text);
        System.out.println("Strategy: " + strategy.getClass().getSimpleName());
        System.out.println("Input: " + text + " | Is Palindrome: " + result);
    }

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 12.0 (Design Pattern Implementation)");
        System.out.println("====================================================");

        PalindromeCheckerApp app = new PalindromeCheckerApp();
        String testWord = "Racecar";

        // Runtime selection of algorithm
        app.setStrategy(new StackStrategy());
        app.runValidation(testWord);

        System.out.println("----------------------------------------------------");

        app.setStrategy(new DequeStrategy());
        app.runValidation(testWord);
    }
}