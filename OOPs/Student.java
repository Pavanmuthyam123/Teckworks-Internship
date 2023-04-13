import java.util.*;
class Student
  {
    public String name;
    public int age;
    public String address;
    public Student()
    {
      this.name="Unknown";
      this.age=0;
      this.address="Not Avaliable";
    }
    public void setInfo(String name, int age)
    {
      this.name=name;
      this.age=age;
    }
    public void setInfo(String name, int age, String address)
    {
      this.name=name;
      this.age=age;
      this.address=address;
    }
    public void display()
    {
      System.out.println(name);
      System.out.println(age);
      System.out.println(address);
    }
public static void main(String args[])
  {
  Student s1 = new Student();
  s1.setInfo("pavan",21,"polavaram");
  s1.display();
  Student s2 = new Student();
  s2.setInfo("pavan",21);
  s2.display();
  }
}
