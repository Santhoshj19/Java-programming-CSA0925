import java.util.Scanner;
class Countfibonacci
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int evenSum = evenFibonacciSum(n);
        System.out.println("Sum of even numbers in Fibonacci series till the " + n + "th term: " + evenSum);

        scanner.close();
    }

    // Method to find the sum of even numbers in the Fibonacci series up to the nth term
    public static int evenFibonacciSum(int n) {
        int a = 0, b = 1, sum = 0, fib;

        for (int i = 0; i <= n; i++) {
            if (a % 2 == 0) {
                sum += a;
            }
            fib = a + b;
            a = b;
            b = fib;
        }
        return sum;
    }
}
