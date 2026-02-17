/**
 * ============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program checks whether a given string
 * is a palindrome by reversing it using a loop.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display original and reversed string
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals() method
        if (original.equals(reversed)) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
