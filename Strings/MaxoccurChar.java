import java.util.*;
class MaxoccurChar
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
        int maxCount = 0;
        char maxChar = ' ';
        for (int i=0;i<256;i++) 
        {
            if (freq[i]>maxCount) 
            {
                maxCount = freq[i];
                maxChar = (char)i;
            }
        }
        System.out.println("The maximum occurring character is: " + maxChar + " frequency is: " + maxCount);
    }
}