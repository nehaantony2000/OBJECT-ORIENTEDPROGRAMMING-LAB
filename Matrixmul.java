import java.util.*;
import java.io.*;
 class mat
{
	int p,q ,m,n,i,j,k,sum;
	public void readmat()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the row of first matrix");
		m=in.nextInt();
		System.out.println("enter the column of matrix");
		n=in.nextInt(); 
		System.out.println("enter the row of second matrix");
		p=in.nextInt();
		System.out.println("enter the column of matrix");
		q=in.nextInt();
		if(m==q)
		{
		int a[][]=new int[m][n];
		int b[][]= new int[p][q];
		int mul[][]=new int[m][q];
		System.out.println("enter the elements of first matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		
		System.out.println("enter the elements of second matrix");
	
		for(i=0;i<p;i++)
		{for(j=0;j<q;j++)
			{
				b[i][j]=in.nextInt();
			}
		}
      
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				sum=0;
				for(k=0;k<m;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
			
                mul[i][j]=sum;
     
               }
			   }
			   System.out.println("MATRix after Multiplication");
	        for(i=0;i<m;i++)
		   {
			  for(j=0;j<n;j++)
			 {
				System.out.println(mul[i][j]);
			 }
		   }
	}
    }
	}
	 public class Matrixmul
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.readmat();
			
		}
	}