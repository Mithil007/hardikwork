
/**
 * Write a description of class deserialize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;

public class deserialize
{
    public static void main(String[] args)
    {
        emp e=null;
        
        try{
            FileInputStream filein=new FileInputStream("employee.ser");
            ObjectInputStream in=new ObjectInputStream(filein);
            
            e=(emp)in.readObject();
            in.close();
            filein.close();
        }catch(IOException i)
        {
            i.printStackTrace();
        }catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
        
 
       System.out.println(e.name);
       System.out.println(e.address);
       System.out.println(e.phno);
       System.out.println(e.number);
    }
}
