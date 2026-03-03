public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        String testString = "racecar";
        boolean isPalindrome = isPalindrome(testString);
        System.out.println(testString + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
    }

    public static boolean isPalindrome(String str) {
        // Base condition: if the string is empty or has a single character
        if (str.length() <= 1) {
            return true;
        }
        // Compare the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        // Recursive call
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}