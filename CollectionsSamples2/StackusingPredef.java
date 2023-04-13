import java.util.Stack;
class StackusingPredef 
{
  public static void main(String[] args) 
  {
    Stack<Integer>s= new Stack<>();
    s.push(100);
    s.push(200);
    s.push(300);
    System.out.println("Stack: " + s);
    s.pop();
    System.out.println("Stack after pop: " + s);
    }
}