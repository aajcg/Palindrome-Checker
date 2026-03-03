import java.util.Deque;
import java.util.LinkedList;

// Context for the Strategy Pattern
class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack Strategy Implementation
class StackPalindromeChecker implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy Implementation
class DequePalindromeChecker implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Main Application
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String testString = "A man a plan a canal Panama".replaceAll("[\W_]+", "").toLowerCase(); // Example input

        // Using Stack strategy
        checker.setStrategy(new StackPalindromeChecker());
        System.out.println("Is palindrome (Stack): " + checker.checkPalindrome(testString));

        // Using Deque strategy
        checker.setStrategy(new DequePalindromeChecker());
        System.out.println("Is palindrome (Deque): " + checker.checkPalindrome(testString));
    }
}