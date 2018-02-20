
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;

public class demo
{
  public static void main(String[] args)
  {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      
      System.out.println("Enter Your Total Number :: ");
      
      try{
          int username=Integer.parseInt(br.readLine());
          int usertemp=0;
          
          for(int i=1;i<=username;i++)
          {
              System.out.println("Enter Number :: ");
              System.out.flush();
              
              usertemp=usertemp+Integer.parseInt(br.readLine());
              
          }
          
          int avg=usertemp/username;
          System.out.println("avg :: "+avg);
          
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    
  }
}
