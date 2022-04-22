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
	
		System.out.println("even number=");
	for(i=0;i<m;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
			
		
    
		}
			System.out.println("odd numbers=");
			for(i=0;i<m;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
			
		
    
		}
}
}
	 public class OddEven
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.read();
			
		}
	}