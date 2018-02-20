import java.util.*;
import java.io.*;

public class Nummatch
{
    public static void main(String[] args)
    {
        InputStreamReader ipreader = new InputStreamReader(System.in);
        BufferedReader buffreader = new BufferedReader(ipreader);
        
        try
        {
            
            Random rand = new Random();
            int r = rand.nextInt();
            
                System.out.println("Enter your Lucky number : ");
                 int choice = Integer.parseInt(buffreader.readLine());
            
            System.out.println("System number is  " +r);
            System.out.println("Your number is  " +choice);
            
            if(r==choice)
            {
                System.out.println("You are winner");
            }
            else
            {
                System.out.println("You are looser");
            }
        }
        catch(IOException e)
        {
            System.out.println("error is "+e.getMessage());
        }
        
       
    }
}
