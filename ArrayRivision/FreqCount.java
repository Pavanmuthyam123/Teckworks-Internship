import java.util.*;
class FreqCount
{
	public static void main(String[] args) 
  {
	  int arr[]={1,2,2,3,4,5,4};
	  for(int i=0;i<=arr.length-1;i++)
	  {
	      int c=1;
	      for(int j=i+1;j<=arr.length-1;j++)
	      {
	          if(arr[i]==arr[j])
	          {
	              c++;
	              arr[j]=-1;
	          }
	      }
	      if(arr[i]!=-1)
	      {
	          System.out.println(arr[i]+":"+c);
	      }
	  }
	}
}
