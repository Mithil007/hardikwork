class Multidimarr
{
    public static void main(String[] args)
    {
        int length = args.length;
        
        if(length == 1)
        {
            int size = Integer.parseInt(args[0]);
            
            int[][] mularr = new int[size][size];
            
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    if(i==j)
                    {
                        mularr[i][j] = 1;
                    }
                    else
                    {
                        mularr[i][j] = 0;
                    }
                    
                    System.out.print(mularr[i][j]+ " "); 
                }
                System.out.print("\n");
            }
        }
    }
}