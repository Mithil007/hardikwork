public class Circle extends Shapecal
{
    double radius;
    double area;
    
    Circle(double r)
    {
        radius = r;
    }
    void areacal()
    {
        double a = java.lang.Math.pow(radius,2.0);
        double pi = java.lang.Math.PI;
        
        area = pi*a;
    }
    
    void display()
    {
        System.out.println("Area of Circle = "+area);
    }
}