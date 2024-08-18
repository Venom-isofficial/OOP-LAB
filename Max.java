public class Max {

    // Method to find the maximum of three integers

    
    public static int max(int x, int y, int z) {
        // Compare x with y and z to find the largest
        int max = x; // Assume x is the largest initially

        if (y > max) {
            max = y; // Update max if y is larger
        }

        if (z > max) {
            max = z; // Update max if z is larger
        }

        return max; // Return the largest value
    }

    public static void main(String[] args) {
        // Test the max() method with some values
        int a = 10;
        int b = 20;
        int c = 15;

        // Call the max() method and store the result
        int largest = max(a, b, c);

        // Print the largest value
        System.out.println("The largest value is: " + largest);
    }
}
