import java.util.*;
 class Employee extends Company 
 {
     String name;
     double salary;
   public Employee(String name, double salary) throws Exception
   {
      if(salary<9.5)
      {
         throw new Exception("Salary can't be less than min wage");
      }
        this.name=name;
        this.salary=salary;
   }
    public String getName()
   {
     return name;
   }
   public double getSalary()
   {
     return salary;
   }
 }
class Company
  {
    String s1[]=new String[4];
    void addemployee()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of employee:");
      for(int i=0;i<4;i++)
       {
         s1[i]=s.next();
       }
    }
     void removeemployee()
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the name of employee to be removed:");
     String removeEmployee=s.next();
     for(int j=0;j<=s1.length-1;j++)
       {
         if(s1[j]==removeEmployee)
         {
      
         }
       }
      void displayEmployees()
   {
     System.out.println("display employees:");
     for(int k=0;k<=s1.length-1;k++)
       {
         System.out.println(s1[k]);
       }
   }
   class CompanyMain
     {
     public  void main(String[] args)
       {
          Employee e=new Employee("Pavan",6.7);
          e.addemployee();
          e.removeemployee();
          e.displayEmployees();
          System.out.println(e.getName());
          System.out.println(e.getSalary());
       }
    }

   