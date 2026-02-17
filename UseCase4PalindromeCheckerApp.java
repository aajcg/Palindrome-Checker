/**
 * ============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This program converts a String into a character array
 * and checks whether it is a palindrome using
 * the two-pointer technique.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String original = "radar";

        // Convert string to character array
        char[] characters = original.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two-pointer approach
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Original String : " + original);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
