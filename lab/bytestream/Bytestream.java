import java.io.*;
public class Bytestream
{
    public static void main(String[] args) throws IOException
    {
        File newfile = new File("H:\\java practical\\lab\\charaterwrite\\content.txt");
        FileOutputStream fo = new FileOutputStream("H:\\java practical\\lab\\charaterwrite\\content.txt");
        BufferedOutputStream bw = new BufferedOutputStream(fo);
        
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(ip);
        
        System.out.println("what is your name?");
        String name = buff.readLine();
        
        System.out.println(name);
        
        bw.write(name.getBytes());
        bw.close();
        fo.close();
        
        FileInputStream fi = new FileInputStream("H:\\java practical\\lab\\charaterwrite\\content.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);
        
        int available = bi.available();
        
        System.out.println(available);
        
        byte[] rdin = new byte[available];
        
        int readbyte = bi.read(rdin);
        
        System.out.println("inside the file data is = "+ new String(rdin));
        
        bi.close();
        fi.close();
        
    }
}
