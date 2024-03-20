import java.util.Scanner;
class Leapyear
{
 public static void main(String[]args)
{
  Scanner scanner=new Scanner(System.in);
 int year;
 System.out.println("Enter the year: ");
  year=scanner.nextInt();

if (year%4==0){
 System.out.println("Leap Year");
}
else{
 System.out.println("Not a leap year");
}
}
}