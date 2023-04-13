import java.util.*;
class Employee
  {
      String emp;
      int emp_id;
      String emp_add;
      Employee(String emp,int emp_id,String emp_add)
    {
      this.emp=emp;
      this.emp_id=emp_id;
      this.emp_add=emp_add;
    }
    public String toString()
    {
      return(emp+" "+emp_id+" "+emp_add);
    }
  }
class ArrayListEmployee
  {
    public static void main(String args[])
    {
      ArrayList<Employee>ar1=new ArrayList<>();
      ar1.add(new Employee("muthyam",100,"polavaram"));
      ar1.add(new Employee("Pavan",101,"vijayawada"));
      System.out.println(ar1.toString());
      System.out.println(ar1.get(1));
      System.out.println(ar1);
      ArrayList<Employee>ar2=new ArrayList<>();
      ar2.add(new Employee("Rohit",103,"Polavaram"));
      System.out.println(ar2.toString());
      System.out.println(ar2.remove(0));
    }
  }