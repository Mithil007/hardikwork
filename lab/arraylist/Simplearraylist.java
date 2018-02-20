import java.util.*;

class Simplearraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        
        Iterator i =a.iterator();
        
       while(i.hasNext())
       {
           System.out.println(i.next());
        }
        
    }
}