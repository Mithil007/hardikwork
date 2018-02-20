import java.io.*;

public class Printwriter
{
   public static void main(String[] args) throws IOException
   {
       FileWriter fw = new FileWriter("H:\\java practical\\lab\\printwriter\\content.txt");
       PrintWriter pw = new PrintWriter(System.out);
       
       pw.println("yash");
       pw.println("patel");
       fw.write("ys");
       
       pw.close();
       fw.close();
    }
}
