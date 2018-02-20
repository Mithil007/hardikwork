import java.io.*;
import java.lang.String.*;
public class Stringclass
{
    public static void main(String[] args)
    {
     InputStreamReader ip = new InputStreamReader(System.in);
     BufferedReader buff = new BufferedReader(ip);
        
      try
      {
        String str = new String(buff.readLine());
        System.out.println(str);
        
        System.out.println("length of string is "+str.length());
        
        System.out.println("string third character is "+str.charAt(2));
        
      }
      catch(IOException e)
      {
        System.out.println("error = "+e.getMessage());  
       }
    }
}
