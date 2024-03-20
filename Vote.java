import java.util.Scanner;
class Vote
{
 public static void main(String[]args)
{
  Scanner scanner=new Scanner(System.in);
 int age,year;
 System.out.println("Enter the age: ");
  age=scanner.nextInt();

if (age>=18){
 System.out.println("You are Eligible to vote");
}
else
{
 year=18-age;
 System.out.println("You are not Eligible to vote");
 System.out.println("You left "+ year +" years to Eligible to vote");
}
}
}