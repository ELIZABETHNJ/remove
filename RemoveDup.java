# remove
import java.io.*;
class RemoveDup
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the string : ");
    String s = br.readLine();
    int l = s.length();
    char ch;
    String ans="";
    
    for(int i=0; i<l; i++)
    {
      ch = s.charAt(i);
      if(ch!=' ')
      ans = ans + ch;
      s = s.replace(ch,' '); 
    }
    
    System.out.println("The String after removing duplicate characters : " + ans);
  }
}
