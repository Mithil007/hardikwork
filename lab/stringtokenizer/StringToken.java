import java.io.*;
import java.util.StringTokenizer;

public class StringToken
{
   public static void main(String[] args)
   {
      // String s = "i am yash";
       
       StringTokenizer str = new StringTokenizer("yash patel k"," ");
       
       while(str.hasMoreTokens())
       {
           System.out.println(str.nextToken());
        }
      // BufferedStringTokenizer bff = new BufferedStringTokenizer();
       
      
       
    }
}
