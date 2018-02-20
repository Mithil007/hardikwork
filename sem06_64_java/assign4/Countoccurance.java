import java.io.*;
import java.util.*;

public class Countoccurance
{
    public static void main(String args[])
  {
       InputStreamReader ip = new InputStreamReader(System.in);
       BufferedReader buff = new BufferedReader(ip);
        
      try
      {
            int[] a = new int[50];
            int[] b = new int[50];
            
            int val = Integer.parseInt(buff.readLine());
            
            int i=0;
            int j1=0;
            int n=0;
            int count;
            
           while(val > 0)
           {
               int num = val % 10;
               a[i] = num;
               val = val / 10;
               i++;
            }
            
            b[n] = a[i-1];
         
            for(int j=i-1;j>=0;j--)
            {
                for(int k=i-1;k>=0;k--)
                {
                    if(a[j]==a[k])
                    {
                       // break;
                    }
                    else
                    {
                        for(int s=0;s<=n;s++)
                        {
                            if(a[j]==b[s])
                            {
                              
                            }
                            else
                            {
                                n++;
                                b[n] = a[j];
                            }
                        }
                    }
                }
            }
            
            for(int h=0;h<=n;h++)
            {
                System.out.println(b[h]);
            }
           
      }
      catch(ArrayIndexOutOfBoundsException a)
      {
          System.out.println("error = "+a.getMessage());
        }
      catch(IOException e)
      {
        System.out.println("error = "+e.getMessage());  
       }
      
    }
}
