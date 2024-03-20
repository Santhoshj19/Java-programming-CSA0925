import java.util.Scanner;
class ReverseAndAddPalindrome {

    
    static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a palindrome
    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = reverseNumber(num);
        return original == reversed;
    }

   
    static int reverseAndAddToPalindrome(int num) {
        int iterations = 0;
        while (!isPalindrome(num)) {
            int reversed = reverseNumber(num);
            num += reversed;
            iterations++;
            System.out.println(num);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the number: ");
        int inputNum = scanner.nextInt();

        
        int result = reverseAndAddToPalindrome(inputNum);

        
        System.out.println("Palindrome number: " + result);

        scanner.close();
    }
}
