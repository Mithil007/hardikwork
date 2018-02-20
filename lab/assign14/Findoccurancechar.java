import java.util.*;
import java.io.*;

public class Findoccurancechar
{

    public static void main(String[] args) throws IOException
    {
        //InputStreamReader ip = new InputStreamReader(System.in);
        //BufferedReader bff = new BufferedReader(ip);
        
        FileReader fr = new FileReader("H:\\java practical\\lab\\yash.txt");
        BufferedReader br = new BufferedReader(fr);
        
      //  System.out.println("enter a string : ");
        String s = null;
        int i=0;
        
        while((s=br.readLine()) != null)
        {
            StringTokenizer str = new StringTokenizer(s," ");
            i = i+ str.countTokens(); 
        }
        
        
       // System.out.println("String is "+);
        
        //int words = countTokens(str);
        
        System.out.println("number of words are "+i);
        
    }
}
