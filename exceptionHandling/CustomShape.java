import java.util.*;
class InvalidShapesException extends Exception
  {
    public InvalidShapesException(String message)
    {
      super(message);
    }
  }
class shape
  {
     double radius;
     double length;
     double breadth;
     double area;
     void Areaofcircle()
     {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius");
        rad=s.nextDouble();
       try
         {
            if(rad<=0)
              {
                 throw new InvalidShapesException("radius be greater than zero");
              }
            else
              {
                 area=3.14*rad*rad;
                 System.out.println("Area of a circle is:"+area);
              }
         }
            catch(InvalidShapesException h)
              {
              System.out.println(h);
              }
          }
       void Areaofrectangle()
            {
              Scanner s=new Scanner(System.in);
              System.out.println("enter the length and breadth");
              double length=s.nextDouble();
              double breadth=s.nextDouble();
              try
               {
                  if(length<=0 && length<=0)
                    {
                  throw new InvalidShapesException("length and breadth must be greater than zero"); 
                    }
                  else
                    {
                      area=length*breadth;
                      System.out.println("Area of a Rectangle is:"+area);
                    }
               }
              catch(InvalidShapesException h)
               {
                  System.out.println(h);
               }
          }
    }
class CustomShapes
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the dimension calculation:");
      int a=s.nextInt();
      shape s[]=new shape[a];
      for(int i=0;i<=a;i++)
        {
          s[i]=new Shape();
          s[i].Areaofcircle();
          s[i].Areaofrectangle();
          s[i].AreaofTriangle();
        }
    }
  }