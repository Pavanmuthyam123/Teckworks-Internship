import java.util.Scanner;
class Food
  {
    public String name;
    public String items;
    public double amount;
    Food(String a,String b,double c)
    {
       name=a;
       items=b;
       amount=c;
    }
     public void setdetails()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the name: ");
      String name=s.nextLine();
      System.out.println("enter the items: ");
      String items=s.nextLine();
      System.out.println("enter amount: ");
      double amount=s.nextDouble();
    }
     public void getName()
    {
      String name="Maggi";
      System.out.println(name);
    }
     public void getitems()
    {
     String items="water,noodiles,salt,masala";
      System.out.println(items);
    }
     public void getamount()
    {
     double amount=60;
      System.out.println(amount);
    }
  }
class Restaurant
  {
    public static void main(String arg[])
    {
      Food d=new Food("Maggi","water,salt,Noodiles",60.00);
      d.setdetails();
      d.getName();
      d.getitems();
      d.getamount();  
    }
  }