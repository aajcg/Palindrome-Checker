import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    // Method to check if a string is a palindrome using Queue (FIFO)
    public static boolean isPalindromeUsingQueue(String str) {
        LinkedList<Character> queue = new LinkedList<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
        }

        while (queue.size() > 1) {
            if (queue.poll() != queue.pollLast()) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a string is a palindrome using Stack (LIFO)
    public static boolean isPalindromeUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "racecar";
        System.out.println("Is palindrome (using Queue): " + isPalindromeUsingQueue(testString));
        System.out.println("Is palindrome (using Stack): " + isPalindromeUsingStack(testString));
    }
}