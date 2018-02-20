import java.io.*;

public class Filewriter
{
    public static void main(String[] args)
    {
        try{
            FileWriter fw = new FileWriter("H:\\java practical\\lab\\filewriter\\content.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("i am yash patel");
            
            bw.close();
            fw.close();
            
            
            FileReader fr = new FileReader("H:\\java practical\\lab\\filewriter\\content.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String s = null;
            
            while((s=br.readLine())!= null)
            {
                System.out.print(s);
            }
            br.close();
        }catch(IOException e)
        {
            System.out.println("its error"+e.getMessage());
        }
    }
}