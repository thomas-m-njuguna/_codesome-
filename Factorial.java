import java.util.Scanner; // Import Scanner for user input

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read the input number
        scanner.close(); // Close the scanner to prevent resource leak

        long factorial = 1; // Variable to store the factorial result

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
 
