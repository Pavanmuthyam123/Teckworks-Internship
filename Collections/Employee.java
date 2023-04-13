import java.util.*;
class Employee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayList<emp> emplist=new ArrayList<>();
      emplist.add(new emp(101,"Muthyam",21,10000));
      emplist.add(new emp(102,"pavan",22,20000));
      emplist.add(new emp(103,"Raju",23,30000));
      Iterator it=emplist.iterator();
      while(it.hasNext())
        System.out.println(it.next());
      String verify=null;
      System.out.println("Enter id to get employee Details: ");
      int sid=sc.nextInt();
      for(emp e:emplist)
        if(e.getId()==sid)
        {
         // e.toString();
          System.out.println("id:"+e.getId()+ "name:"+e.getName()+ "age:"+e.getAge()+ "salary:"+e.getSalary());
          verify="found";
          break;
        }
      if(verify==null)
      {
  System.out.println("Not found");
      }
  }
    String verify2 = null;
    System.out.println("enter id to delete employee details");
     int del = s.nextInt();
     for(emp e :emplist)
       {
          if(e.getId()== del)
          {
            employeelist.remove(e);
            verify2 = "found";
            break;
          }
         if(verify==null)
         {
            System.out.println("not found");
            Iterator itr = employeeList.iterator();
            while (it.hasNext())
              {
                System.out.println(itr.next());
              }
          }
      }
}
class emp
  {
    int id;
    String name;
    int age;
    double salary;
    emp(int id,String name,int age,double salary)
    {
      this.id=id;
      this.name=name;
      this.age=age;
      this.salary=salary; 
    }
	public int getId() 
    {
		  return id;
	  }
	public String getName()
    {
		  return name;
	  }
	public int getAge() 
    {
		  return age;
	  }
	public double getSalary() 
    {
		  return salary;
	  }
    public String toString()
    {
      return "id:"+id+ "name:"+name+ "age:"+age+ "salary:"+salary;
    }
  }