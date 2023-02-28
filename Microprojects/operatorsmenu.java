import java.util.Scanner;
class operatorsmenu
  {
   
    static void insertAtfirst(int array[],int size)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("enter ele to insert:");
          int ele=s.nextInt();
          array[0]=ele;
          System.out.println("array after insertion ");
          for(int i=0;i<size;i++){
            System.out.println(array[i]);
          }
        }
    static void insertAtlast(int array[],int size)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("enter element to insert at last");
          int element=s.nextInt();
          array[size-1]=element;
          System.out.println("enter option again");
          for(int i=0;i<size;i++)
            {
              System.out.println(array[i]);
            }
           
        }
   static void insertAtspecified(int array[],int size)
        {
          int temp[]=new int[size];
        System.out.println("enter ele position");
        System.out.println("enter eleement");
          Scanner s=new Scanner(System.in);
          int ele=s.nextInt();
          System.out.println("enter position:");
          int pos=s.nextInt();
          for(int i=0;i<size;i++){
            if(i!=pos-1){
              temp[i]=array[i];}
            else
            {
              temp[pos]=ele;
              
            }
            }
          for(j=0;j<size;j++){
            System.out.println(temp[i]);
          }
          }
        
    static void RemoveAtfirst(int array[],int size)
        {
          System.out.println("array after deletion");
        for(int i=1;i<size;i++){
          System.out.println(array[i]);
        }
        }
    static void RemoveAtlast(int array[],int size)
        {
          System.out.println("array after deleting last: ");
          for(int i=0;i<size-1;i++){
            System.out.println(array[i]);
          }
        }
    static void RemoveAtspecified(int array[],int size)
        {
         
        }
    static void Removeuserentered(int array[],int size)
        {
         System.out.println("enter to remove from array");
          int i;
          Scanner s=new Scanner(System.in);
          int remove=s.nextInt();
          for(i=0;i<size;i++)
            {
              if(array[i]==remove)
                array[i]=0;
            }
          for(int j=0;j<size;j++){
            System.out.println(array[j]);
          }
          if(i==size)
            System.out.println("Reamove is not avaliable "+remove);
        }
     static void ASCDESC(int array[],int size)
        {
        for(int i=0;i<size-1;i++){
          for(int j=i+1;j<size;j++){
            if(array[i]<array[j]){
              int temp=array[i];
              array[i]=array[j];
              array[j]=temp;
              
            }
            
          }
        }
          System.out.println("array in asc order");
          for(int i=0;i<size;i++){
            System.out.println(array[i]);
          }
        }
     static void Displayarray(int array[],int size)
        {
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
          }
        }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size: ");
      int size=s.nextInt();
      int array[]=new int[size];
      System.out.println("enter the elements: ");
      for(int i=0;i<size;i++){
        array[i]=s.nextInt();
      }
      System.out.println("1.insert an element in first index ");
      System.out.println("2.insert an element in last index ");
      System.out.println("3.insert an element in specified index ");
      System.out.println("4.Remove an element from first index ");
      System.out.println("5.Remove an element from last index ");
      System.out.println("6.Remove an element from specified index ");
      System.out.println("7.Remove user entered element ");
      System.out.println("8. Display all in ASC/DESC ORDER ");
      System.out.println("9.Display array elements ");
      int option=s.nextInt();
      switch(option)
        {
          case 1:insertAtfirst(array,size);
            break;
          case 2:insertAtlast(array,size);
            break;
          case 3:insertAtspecified(array,size);
            break;
          case 4:RemoveAtfirst(array,size);
            break;
          case 5:RemoveAtlast(array,size);
            break;
          case 6:RemoveAtspecified(array,size);
            break;
          case 7:Removeuserentered(array,size);
            break;
          case 8:ASCDESC(array,size);
            break;
          case 9:Displayarray(array,size);
            break;
        }
      
    
  