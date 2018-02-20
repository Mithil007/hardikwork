
public class Dynamicarr
{
    public static void main(String args[])
    {
      int length = args.length;  
      
      try{
    
        if(length==1)
        {
           int size=Integer.parseInt(args[0]);
           int[][] dyarr = new int[size][];
           
           int k=0;
           
           for(int i=0;i<size;i++)
           {
               dyarr[i] = new int[i+1];
               
                for(int j=0;j<i+1;j++)
                {
                    dyarr[i][j]=k;
                    k++;
                }
            }
            
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    System.out.println(dyarr[i][j]+" ");
                }
            }
        }
    }catch(ArrayIndexOutOfBoundsException a)
      {
          System.out.println("error = "+a.getMessage());
        }
    }
}