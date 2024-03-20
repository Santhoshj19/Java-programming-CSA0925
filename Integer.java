import java.util.Scanner;
class Integer
{
 public static void main(String[]args)
{
  Scanner scanner=new Scanner(System.in);
 int number;
 System.out.println("Enter the number: ");
  number=scanner.nextInt();

if (number>=0){
 System.out.println("Positive Number");
}
else{
 System.out.println("Negative number");
}
}
}