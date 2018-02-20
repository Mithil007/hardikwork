class Onedimarr
{
    public static void main(String[] args)
    {
        int length = args.length;
        
        System.out.println("length is : "+length);
        
        if(length == 1)
        {
            int size = Integer.parseInt(args[0].toString());
            
            int[] newArr = new int[size];
            
            for(int i=0;i<size;i++)
            {
                newArr[i] = i+1;
            }
            
            for(int i=0;i<size;i++)
            {
                System.out.println(newArr[i]);
            }
        }
        
        
    }
}