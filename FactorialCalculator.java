import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Input validation loop
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a valid non-negative integer.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
        return number;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }

        long factorial = 1; // Use long to handle large values
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int userInput = getNonNegativeInteger(); // Get user input
        long result = calculateFactorial(userInput); // Calculate factorial
        System.out.println("The factorial of " + userInput + " is: " + result); // Display result
    }
}
