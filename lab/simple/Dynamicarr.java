class Dynamicarr
{
    public static void main(String[] args)
    {
        int length = args.length;
        
        if(length == 1)
        {
            int size = Integer.parseInt(args[0]);
            
            int[][] dynarr = new int[size][];
            
            int k=0;
            
            for(int i=0;i<size;i++)
            {
                dynarr[i] = new int[i+1];
                
                for(int j=0;j<i+1;j++)
                {
                    dynarr[i][j] = k;
                    k++;
                }
            }
            
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    System.out.print(dynarr[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
        
    }
}