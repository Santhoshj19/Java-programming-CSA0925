class ReverseString
{
  public static void main(String[] args) 
{
    
    String Name = "TEMPLE";
    String reversedString = "";
    
    for(int i = Name.length()-1; i>=0; i--){
      reversedString = reversedString + Name.charAt(i);
    }
    
    
    System.out.println(reversedString);
  }
}
