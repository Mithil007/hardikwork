import java.util.*;

public class Date
{
    public static void main(String[] args)
    {
        Date s  = new Date();
        
        System.out.println("S tostring = " + s.toString());
        
        int j=0;
        
        for(int i=0;i<100000;i++)
        {
            j = j+i;
        }
        
        Date e = new Date(); 
        
        System.out.println("this book " + (e.getTime() - s.getTime()) + "msecs"); 
    
        }
}