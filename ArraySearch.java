import java.util.*;
import java.lang.*;
public class ArraySearch
{
static Scanner s=new Scanner(System.in);	
 public static void main(String args[])
  {
	  int a,b;
	  int [] A =new int[10];
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the number of elements");
	  a=s.nextInt();
          System.out.println("enter the data into matrix");
          inputdata(a,A);
          System.out.println("Array Search");
          System.out.println("Enter the element you want to search");
          b=s.nextInt();
          search(a,b,A);
          
  }

 public static void inputdata(int a,int [] A)
  {
	 
	  for(int i=0;i<a;i++)
	  {
		  
	    A[i]=s.nextInt();
	  }
 
  }
 
public static void search(int a, int b,int [] A)
 {
           int f=0;
           for(int i=0;i<a;i++)
           {
            if(A[i]==b)
             {
              f++;
             }
             }
            if(f==0)
           System.out.print("Element is not found in the array");
            else
           System.out.print("Element is found in the array");
 }
	  
}





