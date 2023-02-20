import java.util.Scanner;
class electricity
  {
    public static void main(String args[])
    {
  System.out.println("Previous units:");
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
  System.out.println("Current units:");
     int b=s.nextInt();
      elect(a,b);
    }
    public static void elect(int a,int b)
    {
    double units=a+b;
    double total=0;
      System.out.println("Total units: "+units);
       if(units<=50)
		{
      System.out.println("total units for less than 50:" );
		  total=units*0.50;
		  
		}
	  else if(units>50 && units<=150)
        {
          System.out.println("total units for greater than 50 and less than 150:" );
		  total=units*0.75;
		    }
      else if(units>150 && units<=250)
		    {
          System.out.println("total units for greater than 150 and less than 250:" );
		  total=units*1.20;
		    }
      else
		    {
		  total=units*1.50;
		    }
      double gst=20*total/100; 
      double elect_bill=gst+total;
      System.out.println("total elect_bill: "+elect_bill);
    }
  }