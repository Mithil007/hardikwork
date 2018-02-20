
/**
 * Write a description of class darray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;

public class darray
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
      
      int[][] arr=new int[row+1][col+1];
      int r_c=0;
          for(int i=0;i<row;i++)
          {
              int c_sum=0;
              
              for(int j=0;j<col;j++)
              {
                  arr[i][j]=Integer.parseInt(br.readLine());
                  c_sum+=arr[i][j];
              }
              arr[i][col]=c_sum;  
          }
         
          for(int i=0;i<=row;i++)
          {
              int r_sum=0;
              
              for(int j=0;j<col;j++)
              {
                  r_sum+=arr[j][i];
                  //System.out.flush();
                  //System.out.print(arr[i][j]+" ");
              }
              arr[row][i]=r_sum; 
          }
          
          System.out.println();
          for(int i=0;i<=row;i++)
          {
              for(int j=0;j<=col;j++)
              {
                  //System.out.flush();
                  System.out.print(arr[i][j]+" ");
              }
              System.out.println();
          }

          
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
   }
}
