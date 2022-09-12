
public class Prec3_1
{
    public static void main(String[]args)
    {
        Circle obj1=new Circle(2.1,"Red",true);
        Rectangle obj2=new Rectangle(4.58,2.27,"White",false);
        System.out.println("For Circle :-");
        System.out.println("Radius : "+obj1.getRadius());
        System.out.println("Diameter : "+obj1.getDiameter());
        System.out.println("Perimeter : "+obj1.getPerimeter());
        System.out.println("Area : "+obj1.getArea());
        System.out.println("\nFor Rectangle :-");
        System.out.println("Width : "+obj2.getWidth());
        System.out.println("Height : "+obj2.getHeight());
        System.out.println("Perimeter : "+obj2.getPerimeter());
        System.out.println("Area : "+obj2.getArea());

    }
}