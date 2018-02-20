public class Rectangle extends Shapecal
{
    double width;
    double length;
    double area;
    
    Rectangle(double w,double l)
    {
        width = w;
        length = l;
    }
    void areacal()
    {
        area = width*length;
    }
    
    void display()
    {
        System.out.println("Area of Rectangle = "+area);
    }
}
