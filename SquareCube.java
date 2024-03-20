import java.util.Scanner;

public class SquareCube {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Given Number: ");
        double number = scanner.nextDouble();
        
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        
        System.out.println("Square Number: " + square);
        System.out.println("Cube Number: " + cube);
        
        scanner.close();
    }
}
