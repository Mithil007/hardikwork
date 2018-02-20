import java.io.*;

public class Sumofinx
{
  public static void main(String args[])
  {
    InputStreamReader ip = new InputStreamReader(System.in);
    BufferedReader buff = new BufferedReader(ip);

    
    try
    {
        System.out.println("enter number of Rows in matrix : ");
        int r = Integer.parseInt(buff.readLine());
        
         System.out.println("enter number of Cols in matrix : ");
        int c = Integer.parseInt(buff.readLine());
        
        int[][] arr = new int[r][c];
        
        System.out.println("Elements are ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                
                arr[i][j] = (i)+(j);
                System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
            }
        }
        
        System.out.println("Sum of indices matrix : ");
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.print("\n");
        }
        
    }
    catch(IOException e)
    {
            System.out.println("error is : "+e.getMessage());
    }
  } 
}