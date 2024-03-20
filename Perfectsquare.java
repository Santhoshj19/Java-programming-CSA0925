import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquaresWithDigitSum {

    
    static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    
    static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    
    static ArrayList<Integer> perfectSquaresWithDigitSum(int lower, int upper) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (isPerfectSquare(i) && digitSum(i) < 10) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upper = scanner.nextInt();

        
        ArrayList<Integer> result = perfectSquaresWithDigitSum(lower, upper);

        
        System.out.println(result);

        scanner.close();
    }
}
