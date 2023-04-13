import java.util.*;

interface Employee 
{
  public void add_details();
  public void remove_details();
  public void display_details();
  public void first_empdetails();
}
public class Details implements Employee 
{
  String emp_name;
  int id;
  long salary;
  int remove_emp;
  Scanner s = new Scanner(System.in);
  public void add_details(String emp_name, int id, long salary) 
  {
    this.emp_name = emp_name;
    this.id = id;
    this.salary = salary;
  }
  public void remove_details() 
  {
    
  }
  public void display_details()
  {
    System.out.println(a1);
  }
  public void first_empdetails() 
  {
    System.out.println("first employee details");
  }
}
class InterfaceEmployee 
{
  public static void main(String[] args) 
  {
    Empdetails obj =new Empdetails();
    obj.add_details("abc", 101, 900000); 
    ArrayList a1= new ArrayList();
    a1.add(obj);
    System.out.println(a1);

    /*obj.add_details();
    obj.remove_details();
    obj.display_details();
    obj.first_empdetails();*/

  }
}