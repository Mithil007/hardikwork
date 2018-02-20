import java.io.*;
import java.io.IOException;

public class Inputoutput
{
    //instance variables-replace the example below with your own
    
    public static void main(String[] args)
    {
        InputStreamReader ipReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(ipReader);
        
        System.out.println("please enter a total number of numbers for average calculation.");
        
        try
        {
            int usernum = Integer.parseInt(bufferedReader.readLine());
            int usernumtemp = 0;
            
            for(int i=1;i<=usernum;i++)
            {
                System.out.println("please enter a number : ");
                System.out.flush();
                
                usernumtemp = usernumtemp + Integer.parseInt(bufferedReader.readLine());
            }
            
            int avg = usernumtemp/usernum;
            
            System.out.println("the average for the number you entered is : "+ avg);
            }
        catch(IOException e)
        {
            System.out.println("Error while reading from console "+ e.getMessage());
        } 
       
    }
}