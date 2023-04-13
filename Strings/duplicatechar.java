import java.util.Scanner;
class duplicatechar 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = s.nextLine();
      duplicate(str);
  }
  public static void duplicate(String string1)
  {
      int count;   
      char string[] = string1.toCharArray();    
      System.out.println("Duplicate characters: ");   
        for(int i=0;i<string.length;i++) 
          {  
            count = 1;  
            for(int j = i+1;j<string.length;j++) 
              {  
               if(string[i] == string[j] && string[i] != ' ')                           {  
                    count++;  
                    string[j] ='0';  
                  }  
               }  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);
           }
  } 
}