class Threadclass implements Runnable
  {
   public  void run()
    {
      System.out.println("i am runnin gthred");
    }
  }
public class ThreadExample2
{
  public static void main(String h[])
  {
    Threadclass tc=new Threadclass();
    Thread t=new Thread(tc);
    t.start();
  }
}