import java.util.Scanner;
class lower
  {
public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
        System.out.print("enter the row size:");
      int a=s.nextInt();
      System.out.print("enter the coloumn size:");
      int b=s.nextInt();
      int arr[][]=new int[a][b];
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              arr[i][j]=s.nextInt();
            }
        }
     lower(arr,a,b);
    }
    public static void lower(int arr[][],int a,int b)
    {
      for(int i=0;i<a;i++)
        {
           for(int j=0;j<b;j++)
             {
              if(i<j)
                {
                  break;
                }
              else
                {
                System.out.print(arr[i][j]+" ");
                }
             }
        }
    }
  }
