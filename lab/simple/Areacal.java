import java.io.*;
class Areacal
{
    public static void main(String[] args)
    {
        InputStreamReader ipm = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ipm);
        
        System.out.println("Program of Area calculation : ");
        
        try
        {
            do
            {
                System.out.println("press 1 for circle calculation.");
                System.out.println("press 2 for square calculation.");
                System.out.println("press 3 exit.");
                
                    System.out.println("Enter your choice : ");
                    
                    int ip = Integer.parseInt(bf.readLine());
                    if(ip == 1)
                    {
                        System.out.println("Enter Circle Radius : ");
                        double radius = Integer.parseInt(bf.readLine());
                          
                        double a = circle(radius);
                        System.out.println("Circle area is : " + a);
                        
                    }
                    else if(ip == 2)
                    {
                        System.out.println("Enter Square Length : ");
                        int l = Integer.parseInt(bf.readLine());
                          
                        int a = square(l);
                        System.out.println("Square Area is : " + a);
                    }
                    
                    System.out.println("press 1 for continue.");
                    
            }while(Integer.parseInt(bf.readLine())==1);
        }
        catch(IOException e)
        {
            System.out.println("error is : "+ e.getMessage());
        }
    }
    
    public static double circle(double r)
    {
        return (3.14*r*r);
    }
    public static int square(int l)
    {
        return (l*l);
    }
}