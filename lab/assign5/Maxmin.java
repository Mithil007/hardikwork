import java.io.*;

public class Maxmin
{
   public static void main(String args[])
   {
       InputStreamReader ip = new InputStreamReader(System.in);
       BufferedReader buff = new BufferedReader(ip);
       
       try
       {
           System.out.println("Enter the M*N of matrix:");
           int mn = Integer.parseInt(buff.readLine());
           
           int[][] arr = new int[mn][mn];
           int max;
           int min;
           
           System.out.println("Enter elements:");
           
           for(int i=0;i<mn;i++)
           {
               for(int j=0;j<mn;j++)
               {
                   arr[i][j]=Integer.parseInt(buff.readLine());
                }
            }
            
            System.out.println("Matrix is : ");
            for(int i=0;i<mn;i++)
           {
               for(int j=0;j<mn;j++)
               {
                   System.out.print(arr[i][j]+" ");
                }
                System.out.print("\n");
            }
            max = arr[0][0];
            
            for(int i=0;i<mn;i++)
           {
               for(int j=0;j<mn;j++)
               {
                   if(max < arr[i][j])
                   {
                       max=arr[i][j];
                    }
                }
            }
            
            min = arr[0][0];
            
            for(int i=0;i<mn;i++)
           {
               for(int j=0;j<mn;j++)
               {
                   if(min > arr[i][j])
                   {
                       min=arr[i][j];
                    }
                }
            }
            
            System.out.println("Maximun value is "+max);
            System.out.println("Minimum value is "+min);
        }
        catch(ArrayIndexOutOfBoundsException a)
      {
          System.out.println("error = "+a.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("error is : "+e.getMessage());
        }
       
       
       
       
    }
}
