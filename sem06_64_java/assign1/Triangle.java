public class Triangle extends Shapecal
{
    double base;
    double height;
    double area;
    
    Triangle(double b ,double h)
    {
        base = b;
        height = h;
    }
    void areacal()
    {
        area = (base * height)/2;
    }
    
    void display()
    {
        System.out.println("Area of Triangle = "+area);
    }
}