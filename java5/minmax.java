
/**
 * Write a description of class minmax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class minmax
{
    public static void main(String[] args)
   {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      
      try{
      System.out.println("Enter Your Total Number Rows :: ");
      int row=Integer.parseInt(br.readLine());
      System.out.println("Enter Your Total Number Columns :: ");
      int col=Integer.parseInt(br.readLine()); 
      
      int[][] arr=new int[row][col];
      
          for(int i=0;i<row;i++)
          {
              for(int j=0;j<col;j++)
              {
                  arr[i][j]=Integer.parseInt(br.readLine());
              }
          }
          
          System.out.println();
          int min=arr[0][0];
          for(int i=0;i<row;i++)
          {
              for(int j=0;j<col;j++)
              {
                  if(arr[i][j]<min)
                  {
                      min=arr[i][j];
                  }
              }
          }
          
          int max=arr[0][0];
          for(int i=0;i<row;i++)
          {
              for(int j=0;j<col;j++)
              {
                  if(arr[i][j]>max)
                  {
                      max=arr[i][j];
                  }
              }
          }

          System.out.println("maximum value is :: "+max);
          System.out.println("minimum value is :: "+min);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
   }
}
