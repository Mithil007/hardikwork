
public class Square extends Shapecal
{
    double height;
    double area;
    
    Square(double h)
    {
        height = h;
    }
    void areacal()
    {
        double a = java.lang.Math.pow(height,2.0);
        area = a;
    }
    
    void display()
    {
        System.out.println("Area of Square = "+area);
    }
}
