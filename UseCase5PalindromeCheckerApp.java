/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using the Stack data structure (LIFO principle).
 *
 * @author Developer
 * @version 1.0
 */

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Create a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Build reversed string using pop()
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Display original and reversed
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare strings
        if (original.equals(reversed)) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
