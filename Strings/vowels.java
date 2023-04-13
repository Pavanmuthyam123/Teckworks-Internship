import java.util.Scanner;
class vowels 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = s.nextLine();
      vowel(str);
  }
  public static void vowel(String str1)
  {
    char ch;
    int vowel=0,conso=0,space=0;
    int num=0,special=0;
    
    for(int i=0;i<str1.length();i++)
      {
       ch=str1.charAt(i); 
        if(ch>='a' && ch<='z')
        {
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
            vowel++;
          }
          else
          {
            conso++;
          }
        }
        else if(ch>='0' && ch<='9')
          {
            num++;
          }
        else if(ch==' ')
          {
            space++;
          }
        else
          {
            special++;
          }
      }
    System.out.println("Total no.of vowel"+vowel);
    System.out.println("Total no.of conso"+conso);
    System.out.println("Total no.of Nums"+num);
    System.out.println("Total no.of spaces"+space);
    System.out.println("Total no.of special characters: "+special);
      }
  }