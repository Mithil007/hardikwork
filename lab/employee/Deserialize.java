import java.io.*;

public class Deserialize
{
    public static void main(String[] args)
    {
        Employee e = null;
        
        try
        {
            FileInputStream fi = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fi);
            
            e = (Employee)in.readObject();
            in.close();
           fi.close();
           
        }
        catch(IOException i)
        {
            i.printStackTrace();
            return;
            
        }
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
        
        
        System.out.println(e.name);
        System.out.println(e.address);
        System.out.println(e.pno);
        System.out.println(e.number);
        
    }
}
