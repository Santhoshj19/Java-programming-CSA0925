import java.util.Scanner;
class PerfectSquareRoot {
    
    static void findSquareRoot(int num) {
        double squareRoot = Math.sqrt(num);
        System.out.println("Square Root: " + (int) squareRoot + ", " + -(int) squareRoot);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        double squareRoot = Math.sqrt(number);
        if (squareRoot == Math.floor(squareRoot)) {
            findSquareRoot(number);
        } else {
            System.out.println("The number is not a perfect square.");
        }

        scanner.close();
    }
}
