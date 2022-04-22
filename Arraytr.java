import java.util.*;
import java.io.*;
 class mat
{
	int p,q ,m,n,i,j,k;
	public void readmat()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the size");
		m=in.nextInt();
		 
		int a[]=new int[m];
		System.out.println("enter the elements of first matrix");
		for(i=0;i<m;i++)
		{
			
				a[i]=in.nextInt();
			}
	
		
		
		for(i=0;i<m;i++)
		{
					
			
     

	
				System.out.println(a[i]);
			
        }
	
    }
	}
	 public class Arraytr
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.readmat();
			
		}
	}