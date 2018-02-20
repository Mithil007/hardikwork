import java.io.*;

public class Testclass
{   
    public static void main(String[] args)
    {
        int z=0;
       
        InputStreamReader ipreader = new InputStreamReader(System.in);
        BufferedReader buffreader = new BufferedReader(ipreader);
       
        try
        {
            do
            {
                System.out.println("press 1 for calculating area of Triangle.\n");
                System.out.println("press 2 for calculating area of Circle.\n");
                System.out.println("press 3 for calculating area of Square.\n");
                System.out.println("press 4 for calculating area of Reactangle.\n");
                System.out.println("press 5 Exit.\n");
        
                 System.out.println("Enter your choice : ");
                 int choice = Integer.parseInt(buffreader.readLine());
            
            switch(choice)
            {
                case 1 :
                            System.out.println("Enter Base of Triangle : ");
                            double b = Double.parseDouble(buffreader.readLine());
                
                            System.out.println("Enter Height of Triangle : ");
                            double h = Double.parseDouble(buffreader.readLine());
                
                            Shapecal tri = new Triangle(b,h);
                
                            tri.areacal();
                            tri.display();
                            
                            break;
                case 2 :
                            System.out.println("Enter Radius of Circle : ");
                            double r = Double.parseDouble(buffreader.readLine());
                
                            Shapecal cri = new Circle(r);
                
                            cri.areacal();
                            cri.display();
                            
                            break;
                case 3 :
                            System.out.println("Enter Height of Square : ");
                            double height = Double.parseDouble(buffreader.readLine());
                
                            Shapecal squ = new Square(height);
                
                            squ.areacal();
                            squ.display();
                            
                            break;
                case 4 :
                           System.out.println("Enter Width of Rectangle : ");
                            double w = Double.parseDouble(buffreader.readLine());
                            
                            System.out.println("Enter Length of Rectangle : ");
                            double l = Double.parseDouble(buffreader.readLine());
                
                            Shapecal rect = new Rectangle(w,l);
                
                            rect.areacal();
                            rect.display();
                            
                            break;
                case 5 :
                            java.lang.System.exit(0);
                default : 
                
                            System.out.println("Enter Proper Choice . ");
                
            }
            
                System.out.println("Press 1 for Continue .");
                z = Integer.parseInt(buffreader.readLine());
                
           }while(z==1);
        }
        catch(IOException e)
        {
            System.out.println("Error = "+ e.getMessage());
        }
        
    }
}