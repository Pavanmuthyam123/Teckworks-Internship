import java.util.Scanner;
class notes
  {
    public static void main(String args[])
    {
      int digit=0;
      System.out.println("Enter Amount: ");
      Scanner s=new Scanner(System.in);
      int amount=s.nextInt();
      note(amount,digit);
    }
    public static void note(int amount,int digit)
    {
    while(amount>0)
    {
     if(amount>=500)
			{
			 digit=digit+amount/500;
			 amount=amount%500;
      }
		else if(amount>=200)
			{
			  digit=digit+amount/200;
			  amount=amount%200;
			}
		else if(amount>=100)
			{
			  digit=digit+amount/100;
			  amount=amount%100;
			}
		else if(amount>=50)
			{
			  digit=digit+amount/50;
			  amount=amount%50;
			}
    else if(amount>=20)
			{
			  digit=digit+amount/20;
			  amount=amount%20;
			}
    else 
			{
			  digit=digit+amount/10;
			  amount=amount%10;
			}
    }
      System.out.println("count no.of notes: "+digit);
    }
  }
      