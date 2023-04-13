class classExample
  {
    int var1=10;//instance variable
    static int var2=20;//static variable
    void display()
    {
      int var3=300;//local variable
      System.out.println(var1+" "+var2+" "+var3);
    }
    void inc()
    {
      var1=var1+1;
      var2=var2+1;
    }
  }
class Mainclass
  {
    public static void main(String args[])
    {
      classExample ce=new classExample();
      classExample c=new classExample();
      System.out.println(ce.var1+" "+classExample.var2);
      ce.display();
      c.inc();
      ce.inc();
      c.display();
    }
  }