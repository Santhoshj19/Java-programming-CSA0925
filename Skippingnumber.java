import java.util.Scanner;
class Skipnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values of M, N, and K
        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        // Print numbers from M to N skipping K numbers in between
        System.out.println("Numbers from " + m + " to " + n + " skipping " + k + " numbers in between:");
        for (int i = m; i <= n; i += (k + 1)) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}
