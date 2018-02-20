import java.io.*;

public class CharWrite
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("H:\\java practical\\lab\\charaterwrite\\content.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("yash patel");
            bw.append("hello");
            
            int x = 9;
            
            while(x!=0)
            {
                bw.write("hi"+x+"\n");
                x--;
            }
            
            bw.close();
            fw.close();
            
            FileReader fr = new FileReader("H:\\java practical\\lab\\charaterwrite\\content.txt");
            BufferedReader br = new BufferedReader(fr);
            
            int i=-1;
            
            while((i=br.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
