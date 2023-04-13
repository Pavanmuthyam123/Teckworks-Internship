import java.util.*;
interface Registration
  {
    public void registerVehicle();
    public void renewRegistration();
    public void cancleRegistration();
  }
  class car implements Registration
  {
   public void registerVehicle()
    {
    String vechile_name="Maruthi";
    int num_plate=67467;
    System.out.println(vechile_name);
    System.out.println(num_plate);
    }
    public void renewRegistration()
    {
    String state="Andhra Pradesh";
    String Address="Polavaram";
    System.out.println(state);
    System.out.println(Address);
    }
    public void cancleRegistration()
    {
      int cancel_num=674684;
      String cancel_Registration="Not Required Car: ";
      System.out.println(cancel_num);
      System.out.println(cancel_Registration);
    }
  }
public class vechicleRegistration
  {
    public static void main(String args[])
    {
     car c=new car();
     c.registerVehicle();
     c.renewRegistration();
     c.cancleRegistration();
    }
  }