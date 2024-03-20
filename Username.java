import java.util.Scanner;
import java.util.regex.Pattern;

public class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the username: ");
        String username = scanner.nextLine();

        
        boolean isValid = isValidUsername(username);

       
        if (isValid) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is not valid.");
        }

        scanner.close();
    }

    
    public static boolean isValidUsername(String username) {
        
        if (username.isEmpty()) {
            return false;
        }

        
        if (username.length() < 3 || username.length() > 20) {
            return false;
        }

        
        return Pattern.matches("[a-zA-Z0-9]+", username);
    }
}
