// Name :-Param Thumar
// Roll-no :-21ce144
import java.util.Date;
//creating abstract super class
abstract class GeometricObject
{
    String color;
    boolean filledOrNot;
    //creating object of class Date
    Date dateCreated=new Date();
    //creating default constructor
    GeometricObject(){}
    //creating parameterized constructor
    GeometricObject(String color, boolean filledOrNot)
    {
        this.color=color;
        this.filledOrNot=filledOrNot;
    }
    //creating method to set color
    public void setColor(String color)
    {
        this.color=color;}
    //creating method to get color
    public String getColor()
    {
        return color;
    }
    //creating method to set filled
    public void setFilled(boolean filled)
    {
        filledOrNot=filled;
    }
    //creating method to check filled or not
    public boolean isFilled()
    {
        return filledOrNot;
    }
    //creating method for date
    public void getDateCreated()
    {
        System.out.println("Created on: "+dateCreated.toString());
    }
    //creating abstract methods for area and shape
    abstract public double getArea();
    abstract public double getPerimeter();
}
class Circle extends GeometricObject
{
    private double radius;
    //creating default constructor
    Circle(){}
    //creating parameterized constructor
    Circle(double radius)
    {this.radius=radius;
    }
    //creating another parameterized constructor
    Circle(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }
    //creating method to set radius
    public void setRadius(double r)
    {
        radius=r;
    }
    //creating method for get radius
    public double getRadius()
    {
        return radius;
    }
    //creating method to get diameter
    public double getDiameter()
    {
        return radius*2;
    }
    //implementing method for area
    public double getArea()
    {
        return (22*radius*radius)/7;
    }
    //creating method for perimeter
    public double getPerimeter()
    {
        return (2*22*radius)/7;
    }
}
class Rectangle extends GeometricObject
{private double width;
    private double height;
    //creating default constructor
    Rectangle(){}
    //creating parameterized constructor
    Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    //creating another parameterized constructor for super class
    Rectangle(double width, double height, String color, boolean
            filled)
    {
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    //creating method to set width
    public void setWidth(double width)
    {
        this.width=width;
    }
    //creating method to getWidth
    public double getWidth()
    {
        return width;
    }
    //creating method to setHeight
    public void setHeight(double height)
    {
        this.height=height;
    }
    //creating method for getHeight
    public double getHeight()
    {return height;
    }
    //implementing method to getArea for rectangle
    public double getArea()
    {
        return width*height;
    }
    //implementing method to getPerimeter for rectangle
    public double getPerimeter()
    {
        return (2*(width+height));
    }
}
