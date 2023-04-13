class ThreadClass extends Thread
  {
    public void run()
    {
      System.out.println("I am ready to run");
    }
  }
class ThreadExample
  {
    public static void main(String args[])
    {
      ThreadClass t=new ThreadClass();
      t.start();
    }
  }