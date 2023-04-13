import java.util.*;
class ShoppingImp implements ShoppingInterface
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<ShoppingData> sd = new ArrayList<>();
    double costTotal[] = new double[10];
    public void add()
    {
      System.out.println("enter the items with cost and item grade ");
      String name= sc.next();
      double cost = sc.nextDouble();
      char grade = sc.next().charAt(0);
      sd.add(new ShoppingData(name,cost,grade));   
    }
    public void remove()
    {
      if(sd.size() == 0)
      {
        System.out.println("no item available for deleting the data");
      }
      else
      {
        String verify = null;
        System.out.println("enter item name to remove the entire data");
        String str = sc.next();
        for(ShoppingData e:sd)
        {
          if(e.getName().equals(str))
          {
            sd.remove(e);
            verify ="found";
            break;
          }
        }
        if(verify == null)
        {
          System.out.println("already removed the item data from the database");
        }
      }
    }
    public void display()
    {
      if(sd.size()==0)
      {
        System.out.println("no data available for display the items");
      }
      else
      {
        Iterator itr = sd.iterator();
        while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      }
    }
    public void totalCost()
    {
      double cost_count =0;
      for(ShoppingData e : sd)
      {
        for(int i=0;i<sd.length;i++)
        {
        int k = 1;
        cost_count = e[k]+cost_count;
        }
      System.out.println("the total cost of the items :" + cost_count);
      }      
    }
  }