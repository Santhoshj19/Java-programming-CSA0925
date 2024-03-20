import java,util,Scanner; 
class Simpleinterest
{
  public static void main (String args[])
{ 
  int p, r, t, si; 
   p = 20000; 
   r = 12; 
   t = 2;
  
   si = (p*r*t)/100;
  System.out.println("Simple Interest is: " +si);
 }
}