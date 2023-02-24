import java.util.Scanner;
class countnegative
  {
    public static void main(String args[])
    {
      System.out.println("enter array size: ");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("enter array elements");
      int array[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }
      neg(array,n);
    }
    public static void neg(int array[],int n)
    {
      int num=0,i;
      for(i=0;i<n;i++)
        {
          if(array[i]<0)
          {
            num++;
          }
        }
      System.out.println("neg nums is: "+num);
    }
  }