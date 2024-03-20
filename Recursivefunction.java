import java.util.Scanner;

public class Factorial {
    // Recursive function to calculate factorial
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Checking if the input is non-negative
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("The factorial of " + n + " is: " + factorial(n));
        }
        
        scanner.close();
    }
}
