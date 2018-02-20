import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.lang.String;
public class Findcharcter
{
 
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("H:\\java practical\\lab\\yash.txt");
        BufferedReader br = new BufferedReader(fr);

      //  InputStreamReader ip = new InputStreamReader(System.in);
       // BufferedReader bff = new BufferedReader(ip);
        
      //  System.out.println("enter a string : ");
      
      String s = null;
      int i=0;
      
        while((s = br.readLine()) != null)
        {
            StringTokenizer str = new StringTokenizer(s," ");
            i = i + str.countTokens();
        }
        String[] arr  = new String[i];
        
        System.out.println(i);
        while(i>-1)
        {
            System.out.println(arr[i]);
            i--;
        }
       // StringTokenizer str = new StringTokenizer(s," ");
      //  int c = str.countTokens();
        
        // System.out.println("String is "+);
        //int words = countTokens(str);
        
     //   String arr[] = new String[c];
       // int i=0;
       // while(str.hasMoreTokens())
       // {
       //      arr[i] = str.nextToken();
       //         i++;
            
       // }
        
       // System.out.println("number of words are "+str.countTokens());
        
       // int j =0;
     
       // System.out.println(arr);
    }
}
