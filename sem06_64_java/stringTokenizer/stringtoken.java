
/**
 * Write a description of class stringtoken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.StringTokenizer;

public class stringtoken
{
    public static void main(String[] args)
    {
        String s="Hello How are you??";
        
        StringTokenizer st=new StringTokenizer(s," ");
        
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
