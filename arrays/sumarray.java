import java.util.Scanner;
class sumarray
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int arraysize=s.nextInt();
      int array[]=new int[arraysize];
      System.out.println("enter numbers:");
     for(int i=0;i<array.length;i++)
       {
         array[i]=s.nextInt();
       }
      add(array,arraysize);
    }
    public static void add(int array[],int size)
    {
      int add=0;
      for(int i=0;i<size;i++)
        {
          add=add+array[i];
        }
      System.out.println("max num:"+add);
    }
}