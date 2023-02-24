import java.util.Scanner;
class diagonal
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter row size: ");
      int a=s.nextInt();
      System.out.println("enter column size: ");
      int b=s.nextInt();
      int matrix[][] = new int[a][b];
      System.out.println("Enter the elements of the matrix:");
       for (int i = 0; i < a; i++) 
           {
            for (int j = 0; j < b; j++) 
               {
                matrix[a][b] = s.nextInt();
               }
           }
       System.out.println("Diagonal elements of the matrix are:");
      for (int i = 0; i < a; i++)
        {
          for (int j = 0; j < b; j++)
            {
               if (i == j)
               {
                 System.out.println(matrix[i][j] + " ");
               }
            }
        }
    }
  }
        