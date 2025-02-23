import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close(); // Close the scanner to prevent resource leak

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1, next = 0;

        // Print the first two numbers of the Fibonacci sequence
        System.out.print("Fibonacci sequence: " + a + " " + b);

        // Generate and print the Fibonacci sequence up to 'n' terms
        for (int i = 2; i < n; i++) {
            next = a + b; // Calculate the next Fibonacci number
            System.out.print(" " + next);
            a = b; // Move to the next numbers in the sequence
            b = next;
        }

        // Print the nth Fibonacci number
        System.out.println("\nThe " + n + "th Fibonacci number is: " + next);
    }
}
