
/**
 * Write a description of class occurrence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class occurrence
{
    public static void main(String[] argv)
    {
        int c=argv.length;
        int n=Integer.parseInt(argv[0]);
        
        Stack<Integer> s=new Stack<Integer>();
        Vector<Integer> arr=new Vector<Integer>();
        int r=0;
        if(c==1)
        {
            if(n>0)
            {
                while(n>0)
                {
                    r=n%10;
                    s.push(r);
                    n=n/10;
                }
            }
            
            while(!s.isEmpty())
            {
                arr.add(s.pop());
            }  
        }
        
        System.out.println();
        
        for(int i=0;i<arr.size();i++)
        {
            int cc=0;
            for(int i=0;i<arr.size();i++)
            {
                
            }
            System.out.println(arr.get(i));
        }
    }
}
