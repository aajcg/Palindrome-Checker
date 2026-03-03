import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        System.out.println("Is the input a palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                deque.add(Character.toLowerCase(ch));
            }
        }

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}