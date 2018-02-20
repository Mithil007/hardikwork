import java.io.*;

public class FileClass
{
  public static void main(String args[])
  {
      //try
      //{
          File dir = new File("H:\\java practical\\lab");
          System.out.println(dir.getParent());
          
          String[] children = dir.list();
          
          if(children == null)
          {
              System.out.println("Directory does not exist");
            }
            else
            {
                for(int i=0;i<children.length;i++)
                {
                    String filename = children[i];
                    System.out.println(filename);
                }
            }
      //  }
       // catch(IOException i)
      //  {
        //    i.printStackTrace();
        //}
    }
}
