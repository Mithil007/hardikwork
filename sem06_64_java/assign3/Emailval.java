import java.util.regex.*;
import java.io.*;
public class Emailval
{
    public static void main(String[] args) 
    {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(ip);
        
      try
      {
        String email = new String(buff.readLine());
        System.out.println(email);
        
        System.out.println(Pattern.matches("[a-zA-Z]+[a-zA-Z._0-9]+@[a-zA-Z]{5,10}[.]{1}[a-zA-Z]{2,3}",email));
      }
      catch(IOException e)
      {
        System.out.println("error = "+e.getMessage());  
       }
    }
}
