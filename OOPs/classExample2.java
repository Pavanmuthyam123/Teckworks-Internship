class classExample2
  {
    int x=10;
    static int y=20;
  
static void incr()
  {
  System.out.println(y);
  }
void decr()
  {
  x=x-1;
    y-=1;
  System.out.println(x+" "+y);
  }
  }
class main
  {
    public static void main(String args[])
    {
     classExample2 s=new classExample2();
      s.incr();
      s.decr();
      System.out.println(s.x+" "+classExample2.y);
    }
  }

  