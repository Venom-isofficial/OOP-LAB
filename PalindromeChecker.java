import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String word) {
        // Remove any spaces and convert to lowercase to ensure case-insensitivity
        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();
        
        // Get the length of the cleaned word
        int length = cleanedWord.length();
        
        // Compare characters from start to end
        for (int i = 0; i < length / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user for input
        System.out.print("Enter a word to check if it's a palindrome: ");
        String inputWord = scanner.nextLine(); // Read string input from the user

        // Call the isPalindrome() method and store the result
        boolean result = isPalindrome(inputWord);

        // Print the result
        if (result) {
            System.out.println("\"" + inputWord + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputWord + "\" is not a palindrome.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
