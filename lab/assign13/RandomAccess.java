import java.io.*;

public class RandomAccess
{
    public static void main(String[] args)
    {
        try
        {
            RandomAccessFile rf = new RandomAccessFile("demo.txt","r");
            long length = rf.length();
            long toread = 1;
            
            long startfrom = length - toread;
            
            if(startfrom < 0)
            {
                startfrom =0;
            }
            else
            {
                rf.seek(startfrom);
            }
            
            int i=-1;
            
            while((i = rf.read()) != -1)
            {
                System.out.print((char)i);
            }
            rf.close();
            //System.out.println(length);
        }
        catch(Exception e)
        {
        }
    }
}
