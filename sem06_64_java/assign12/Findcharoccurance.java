import java.io.*;
public class Findcharoccurance
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("demo.txt");
        BufferedReader br = new BufferedReader(fr);
    
      int i=-1;
      int c =0;
      
        while((i = br.read()) != -1)
        {
              c++;      
        }
        
        br.close();
        fr.close();
        
        FileReader fr1 = new FileReader("demo.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
        int[] arr = new int[c];
        
        int j=-1;
        c =0;
      
        while((j = br1.read()) != -1)
        {
          
            
              arr[c] = j;
              System.out.print(arr[c]);
              c++;
        }
        
        br1.close();
        fr1.close();
       
        //c=0;
       //System.out.println(c);
        
       int count = 0;
        for(int y=0;y<c;y++)
        {
            count =0;
            for(int z=1;z<c;z++)
            {
                if(arr[y] == arr[z])
                {
                    count++;
                }
            }
            
            
            System.out.println((char)arr[y] + "=" +count);
       }
       
    }
}
