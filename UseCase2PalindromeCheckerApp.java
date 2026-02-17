/**
 * ============================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This program checks whether a hardcoded string
 * is a palindrome and prints the result.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Reverse the string manually
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional statement to check palindrome
        if (word.equals(reversed)) {
            System.out.println("Word: " + word);
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Word: " + word);
            System.out.println("Result: It is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
