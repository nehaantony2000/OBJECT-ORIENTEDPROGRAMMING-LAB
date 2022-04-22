import java.util.*;
import java.io.*;
 class mat
{
	int m,max,i;
	public void large()
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
	
		
	
    
	max=a[0];
	for(i=0;i<m;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Largest element="+max);
	
	}
}
	 public class largest
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.large();
			
		}
	}