import java.util.Scanner;

public class ReverseNumber {

    // Method to reverse the digits of the integer
    public static int reverse(int number) {
        int reversed = 0; // Variable to store the reversed number
        int original = number; // Store the original number for checking sign

        // Handle negative numbers by working with positive equivalent
        number = Math.abs(number);

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            number = number / 10; // Remove the last digit
        }

        // Restore the original sign of the number
        return original < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user for input
        System.out.print("Enter an integer to reverse: ");
        int num = scanner.nextInt(); // Read integer input from the user

        // Call the reverse() method and store the result
        int reversedNum = reverse(num);

        // Print the reversed number
        System.out.println("The reversed number is: " + reversedNum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
