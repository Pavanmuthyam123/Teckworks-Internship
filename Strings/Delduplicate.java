import java.util.*;
class Delduplicate 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
    
      char str[] = s.nextLine().toCharArray();
    int n=str.length;
      delet(str,n);
  }
  public static void delet(char string1[],int n)
  {
   HashSet<Character> s = new LinkedHashSet<>(n - 1);
        for (char x : string1)
            s.add(x);
        for (char x : s)
            System.out.print(x); 
  }
      }
    
  
