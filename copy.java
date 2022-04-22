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
	
		
	
    
  
	for(i=0;i<m;i++)
	{
		
		int b[]=new int[m];
		b[i]=a[i];

	System.out.println(b[i]);
	
	}
}
}
	 public class copy
	{
		public static void main(String[] args)
		{
			mat m=new mat();
			m.read();
			
		}
	}