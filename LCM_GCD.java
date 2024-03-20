import java.util.Scanner;

public class LCM_GCD {
    
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    static int lcmOfArray(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }
    
    static int gcdOfArray(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        int lcmResult = lcmOfArray(numbers);
        int gcdResult = gcdOfArray(numbers);
        
        System.out.println("LCM = " + lcmResult);
        System.out.println("GCD = " + gcdResult);
        
        scanner.close();
    }
}
