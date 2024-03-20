import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input value of N
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Calculate factorial of N
        long factorial = calculateFactorial(n);

        // Print the factorial
        System.out.println(n + " Factorial = " + factorial);
        
        scanner.close();
    }

    // Method to calculate factorial of a number
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
