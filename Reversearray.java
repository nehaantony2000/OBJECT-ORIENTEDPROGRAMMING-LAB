import java.util.*;
import java.io.*;
 class mat
{
	int m,i;
	public void read()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the size");
		m=in.nextInt();
		 
		int a[]=new int[m];
		System.out.println("enter the elements");
		for(i=0;i<m;i++)
		{
			
				a[i]=in.nextInt();
			}
	
		
	
    
    System.out.println("the array=");
     for(i=m-1;i>=0;i--)
	{
	System.out.println(a[i]);
	
	}
}
}
	 public class Reversearray
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.read();
			
		}
	}