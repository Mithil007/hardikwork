
/**
 * Write a description of class spilitint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.*;

public class spilitint
{
   public static void main(String[] args)
   {
       System.out.println(args[0]);
       
       int number=Integer.parseInt(args[0]);
       Stack<Integer> stack=new Stack<Integer>();
       if(number>0)
       {
           while(number>0)
           {
               int n=number%10;
               stack.push(n);
               //System.out.println(n);
               number=number/10;
           }
       }
       //System.out.println(len);
       while(!stack.isEmpty())
       {
           System.out.println(stack.pop());
       }
   }
}
