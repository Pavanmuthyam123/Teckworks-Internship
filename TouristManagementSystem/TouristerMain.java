import java.util.Scanner;
public class TouristerMain
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char ch;
      int choice;
      TouristerImplementation obj=new TouristerImplementation();
      System.out.println("1.Add Tourister Details: ");
      System.out.println("2.Add visited places: ");
      System.out.println("3.Add Tourister charges: ");
      System.out.println("4.Add Choosing Vechicles: ");
      do
      {
        System.out.println("Enter Your choice: ");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:obj.TouristerDetails();
            break;
            case 2:obj.places();
            break;
            case 3:obj.charges();
            break;
            case 4:obj.chooseVechicle();
            break;
            default :System.out.println("Invalid Option");
		        break;
          } 
        System.out.println("Do tou want to continue one more Operation(y/n)");
		        ch=sc.next().charAt(0);
          }
        while(ch!='n');
      }
    }