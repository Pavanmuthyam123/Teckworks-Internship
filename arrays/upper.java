import java.util.Scanner;
class upper
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
     upper(arr,a,b);
    }
    public static void upper(int arr[][],int a,int b)
    {
      for(int i=0;i<a;i++)
        {
           for(int j=0;j<b;j++)
             {
              if(i>j)
                {
                  continue;
                }
              else
                {
                System.out.print(arr[i][j]+" ");
                }
               System.out.println();
             }
        }
    }
  }
