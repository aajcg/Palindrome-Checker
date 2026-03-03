// UseCase11PalindromeCheckerApp.java

// PalindromeChecker class to check if a string is a palindrome
class PalindromeChecker {
    // Private variable to hold the string to be checked
    private String text;

    // Constructor to initialize the PalindromeChecker
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is a palindrome
    public boolean checkPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            // Ignore case and non-alphanumeric characters
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Example use case
public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("A man, a plan, a canal, Panama");
        if (checker.checkPalindrome()) {
            System.out.println("The given text is a palindrome.");
        } else {
            System.out.println("The given text is not a palindrome.");
        }
    }
}