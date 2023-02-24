import java.util.Scanner;
class priceofbook
  {
    public static void main(String args[])
    {
      int books[]={450,200};
      display(books,2);
    }
    static void display(int pb[],int n)
    {
      for(int l=0;l<pb.length;l++)
        {
          System.out.println(pb[l]);
        }
    }
  }