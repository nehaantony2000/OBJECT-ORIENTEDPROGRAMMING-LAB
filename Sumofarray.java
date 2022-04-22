import java.util.*;
import java.io.*;
 class mat
{
	int m,sum,i;
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
	
		
	
    
	sum=0;
	for(i=0;i<m;i++)
	{
		
		{
			sum=sum+a[i];
		}
	}
	System.out.println("Sum of array="+sum);
	
	}
}
	 public class Sumofarray
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.read();
			
		}
	}