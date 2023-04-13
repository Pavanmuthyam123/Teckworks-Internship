import java.util.*;
class Shapes
  {
    String colour;
    Shapes(String colour)
    {
      this.colour=colour;
    }
  }
class Rectangle extends Shapes
  {
    double height;
    double width;
    Rectangle(String colour,double height,double width)
    {
      super(colour);
      this.height=height;
      this.width=width;
    }
 double area()
  {
    return((width*height));
  }
  }
class triangle extends Shapes
  {
    double height;
    double base;
    triangle(String colour,double height,double base)
    {
      super(colour);
      this.height=height;
      this.base=base;
    }
  
 double are()
  {
  return(0.5*(height*base));
  }
  }
class circle extends Shapes
{
  double radius;
  circle(String colour,double radius)
  {
    super(colour);
    this.radius=radius;
  }
double ar()
  {
   return((3.14*radius*radius));
  }
}
class ShapeMain
  {
    public static void main(String args[])
    {
      Shapes s1=new Shapes("colour");
      Rectangle r=new Rectangle("Blue",10.6,78.8);
      r.area();
      triangle t=new triangle();
      t.are();
      circle c=new circle();
      c.ar();
      
    }
  }