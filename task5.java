import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Change all letters to lowercase
        word = word.toLowerCase();

        // Check if the word is a palindrome
        boolean isPalindrome = isPalindrome(word);

        // Print the result
        if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
        scanner.close();
    }

    // Method to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}