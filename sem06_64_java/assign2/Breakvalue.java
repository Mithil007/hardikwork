import java.util.*;
public class Breakvalue
{
  public static void main(String args[])
  {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      int l = args.length;
      
      if(l==1)
      {
       int val = Integer.parseInt(args[0]);
  
           while(val > 0)
           {
               int num = val % 10;
               arr.add(num);
               val = val / 10;
            }
            
            Collections.reverse(arr);
            
            Iterator i = arr.iterator();
            
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
          
       }
       else
       {
           System.out.println("enter only one argument value as a number.");
        }
    }
}
