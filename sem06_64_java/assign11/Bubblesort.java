import java.io.*;

public class Bubblesort
{
    public static void main(String args[])
    {
       InputStreamReader ip = new InputStreamReader(System.in);
       BufferedReader buff = new BufferedReader(ip);
       
       try
       {
           System.out.println("Enter the size of array");
           int s = Integer.parseInt(buff.readLine());
           
           int[] arr = new int[s];
           
           
           System.out.println("Enter elements:");
           
           for(int i=0;i<s;i++)
           {
               
                   arr[i]=Integer.parseInt(buff.readLine());
            }
            
            for(int i=0;i<s-1;i++)
            {
                for(int j=0;j<s-i-1;j++)
                {
                    if(arr[j] > arr[j+1])
                    {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    }
                }
            }
            System.out.println("After bubble sorting .");
            for(int i=0;i<s;i++)
           {
               
                   System.out.print(arr[i]+" ");
            }

        }
        catch(IOException e)
        {
            System.out.println("error is : "+e.getMessage());
        }
       
    }
}