import java.util.Scanner;
class baseSalary
  {
    public static void main(String args[])
    {
      System.out.println("Enter amount : ");
      Scanner s=new Scanner(System.in);
      int basic_sal=s.nextInt();
      int hra=0,da=0,sal=0;
      sal(basic_sal,hra,da,sal);
    }
    public static void sal(int basic_sal,int hra,int da, int sal)
    {
      if(basic_sal<=10000)
		     {
			hra=(20*basic_sal)/100;
			da=(80*basic_sal)/100;
         }
	    else if(basic_sal<=20000)
			   {
			  hra=(25*basic_sal)/100;
			  da=(90*basic_sal)/100;
			   }
      else
			   {
			 hra=(30*basic_sal)/100;
			 da=(95*basic_sal)/100;
			   }
    sal=basic_sal+hra+da;
    
      System.out.println("total sal: "+sal);
    }
  }