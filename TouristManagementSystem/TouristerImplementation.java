import java.util.*;
class TouristerData implements TouristerInterface
  {
    ArrayList<PatientData>al = new ArrayList<>();
    public void TouristerDetails()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter TouristerDetails: ");
      System.out.println("Enter Tourist Places: ");
      String Tourist_place=sc.nextLine();
      System.out.println("Enter Tourister Name: ");
      String Name=sc.nextLine();
      System.out.println("Enter Age: ");
      int age=sc.nextInt();
      System.out.println("Enter Gender: ");
      String gender=sc.nextLine();
      System.out.println("Enter ContactNumber: ");
      long contactnum=sc.nextLong();
      System.out.println("Enter Selected Hotel: ");
      String Hotel=sc.nextLine();
      System.out.println("Enter the No.of Reservations: ");
      int Reservations=sc.nextInt();
      al.add(new TouristerData(Tourist_place,Name,age,gender,contactNum,Hotel,Reservations));
    }
    public void places()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the numbe of places");
      ArrayList<String> l=new ArrayList<>();
      int places=s.nextInt();
      String place1=s.nextLine();
      for(int i=0;i<=places;i++)
        {
          l.add(place1);
        }
    }
     public viod charges()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Charges: ");
      int charge=sc.nextInt();
    }
    public void chooseVechicle()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Vechicles: ");
      String veh=sc.nextLine(); 
    }
    public void viewAll()
    {
       al.add(new TouristerData(Tourist_place,Name,age,gender,contactNum,Hotel,Reservations));
    }
  }