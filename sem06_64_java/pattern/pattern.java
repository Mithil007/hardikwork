
/**
 * Write a description of class pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern
{
   public static void main(String[] args)
   {
       int n=Integer.parseInt(args[0]);
       
       int k=1;
       if((args.length)==1)
       {
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<=i;j++)
               {
                   System.out.print(k*n + " ");
                   k++;
               }
               System.out.println();
           }
       }
    }
}
