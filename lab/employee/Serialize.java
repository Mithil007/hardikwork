import java.io.*;

public class Serialize
{
    public static void main(String args[])
    {
        Employee e = new Employee();
        
        e.name = "yash";
        e.address ="surat";
        e.pno = 12345;
        e.number = 5555;
        
        try
        {
            FileOutputStream fo = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            
            out.writeObject(e);
            out.close();
            
            fo.close();
            
        }
        catch(IOException i)
        {
            
            i.printStackTrace();
        }
    }
}
