import java.util.*;
class StringCompress
  {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        int freq[] = new int[256];
        for (int i=0;i<input.length();i++) 
          {
            char ch = input.charAt(i);
            freq[ch]++;
          }
    }
  }