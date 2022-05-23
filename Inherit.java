import java.util.*;
 class  Employee
{
String Empid;
String Name;
String Salary;
String Address;
public Employee(String Empid,String Name,String Salary,String Address)
{
this.Empid= Empid;
this.Name=Name;
this.Salary=Salary;
this.Address=Address;
}
}
 class Teacher extends Employee
{
String Department;
String Subject;
public Teacher(String Empid,String Name,String Salary,String Address,String Department,String Subject)
{
super(Empid,Name,Salary,Address);
this.Department=Department;
this.Subject=Subject;
}
public void read()
{   Scanner in =new Scanner(System.in);
System.out.println("enter the Employ id=");
       Empid=in.nextLine();
       System.out.println("enter the Name=");
       Name=in.nextLine();
       System.out.println("enter the Salary=");
       Salary=in.nextLine();
       System.out.println("enter the Address=");
       Address=in.nextLine();
       System.out.println("enter the Department=");
       Department=in.nextLine();
       System.out.println("Enter the Subject=");
       Subject=in.nextLine();
}
public void display()
{   System.out.println("______Employee Details__________");
    System.out.println("Empid=" + Empid);
    System.out.println("Name="+ Name);
    System.out.println("Salary=" + Salary);
    System.out.println("Address=" + Address);
    System.out.println("Department=" + Department);
    System.out.println("Subject=" + Subject);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
}
}
public class Inherit
{
    public static void main(String Args[])
    { int i,n;
     Scanner in =new Scanner(System.in);
       System.out.println("Enter the Number of employee=");
       n=in.nextInt();
            Teacher T[] = new Teacher[n];
       for(i=0;i<n;i++)
       {
       T[i]=new Teacher("Empid","Name","Salary","Address","Department","Subject"); 
       T[i].read();
       }
    
    for(i=0;i<n;i++)
    {
        T[i].display();
    }
    }
    }

