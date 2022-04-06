import java.util.*;
import java.io.*;
 class mat
{
	int p,q ,m,n,i,j;
	public void readmat()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the row of first matrix");
		m=in.nextInt();
		System.out.println("enter the column of matrix");
		n=in.nextInt(); 
		int a[][]=new int[m][n];
		System.out.println("enter the elements of first matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		System.out.println("enter the row of second matrix");
		p=in.nextInt();
		System.out.println("enter the column of matrix");
		q=in.nextInt();
		System.out.println("enter the elements of second matrix");
		int b[][]= new int[p][q];
		for(i=0;i<p;i++)
		{for(j=0;j<q;j++)
			{
				b[i][j]=in.nextInt();
			}
		}
	
		int sum[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of the matrices are=");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(sum[i][j]);
			}
		}
	}
	}
	 public class Matrix
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.readmat();
			
		}
	}