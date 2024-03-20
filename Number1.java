import java.util.Scanner;
class Number1
{
 public static void main(String[]args)
{
  Scanner scanner=new Scanner(System.in);
 int x;
 System.out.println("Enter the number: ");
  x=scanner.nextInt();

if (x%2==0){
 System.out.println("Even number");
}
else{
 System.out.println("odd number");
}
}
}