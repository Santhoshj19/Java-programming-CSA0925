import java.util.Scanner;
class Triangle
{
 public static void main(String[]args)
 {
  Scanner scanner=new Scanner(System.in);
 int h;
 int b;
 int area;
 System.out.println("Enter the value of height: ");
 h=scanner.nextInt();
 System.out.println("Enter the value of breath: ");
 b=scanner.nextInt();

 area=(h*b)/2;
System.out.println("Area of Triangle: "+area);
 }
}
