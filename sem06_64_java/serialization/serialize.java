
/**
 * Write a description of class serialize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class serialize
{
    public static void main(String[] args)
    {
        emp e=new emp();
        e.name="Hardik Nakarani";
        e.address="Surat Varachha";
        e.phno=76006;
        e.number=12;
        
        try{
            FileOutputStream fileout=new FileOutputStream("employee.ser");
            ObjectOutputStream out=new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}
