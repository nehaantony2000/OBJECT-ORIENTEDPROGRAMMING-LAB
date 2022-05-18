import java.util.*;
public class Employee
{
int eNo;
String eName;
Float eSalary;


public void read()
{
Scanner in =new Scanner(System.in);
System.out.println("Enter the Employee Number=");
eNo=in.nextInt();
System.out.println("Enter the Employee Name=");
eName=in.next();
System.out.println("Enter the Employee Salary=");
eSalary=in.nextFloat();
	
}
public void display()
{
System.out.println("_____________________Employee Details____________________");
System.out.println(" Number=" + eNo);
System.out.println(" Name=" + eName);
System.out.println(" Salary=" + eSalary);
	  System.out.println("------------------------------------------------------------");
}
		
		
public static void main(String Args[])
{
	Scanner in =new Scanner(System.in);
	int n,i,Item;
	System.out.println("enter the number of employees=");
     n=in.nextInt();
	 Employee E[] =new Employee[n];
	for(i=0;i<n;i++)
	{
	  E[i] =new Employee();
	E[i].read();
	}
	for(i=0;i<n;i++)
	{
		
	E[i].display();
	}
	int item,flag=0 ;
	System.out.println("Enter the EMployee number to be searched");
	 Item=in.nextInt();
     for(i=0;i<n;i++)
	{
	if(E[i].eNo==Item)
	    {
	 flag=1;
	 break;
	 }
	}
	 if(flag==1)
	 
	   E[i].display();
	
	  else
	  System.out.println("Employee doesn't Exist");
	
}
}		