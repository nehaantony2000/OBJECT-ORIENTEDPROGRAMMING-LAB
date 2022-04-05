class student
{
	int id;
	String Sname;
	float m1;
	float m2;
	float m3;
	
	public student(int id1,String name,float mark1,float mark2,float mark3)
	{
		id=id1;
		Sname=name;
		m1=mark1;
		m2=mark2;
		m3=mark3;
		
	}
	
	public void total()
	{
		float total;
		total=m1+m2+m3;
		System.out.println("Total=" +total);
	}
	public void average()
	{
		float avg;
		avg=(m1+m2+m3)/3;
		System.out.println(" \n Average=" +avg);
		
	}
public void display()
	{
		System.out.println("\n-------------------------\n");
		System.out.println(" \n The Student Details \n " );
		System.out.println("-------------------------\n");
		System.out.println(" STUDENT ID " +id   +" \n");
		System.out.println("\n STUDENT NAME " +Sname  +"\n");
		System.out.println("\n Mark1" +m1  +"\n");
		System.out.println("\n Mark2 " +m2 +" \n");
		System.out.println("\n Mark3" +m3 +"\n");
	   total();
	   average();
	System.out.println("-------------------------\n");		
	}
	
}   
 public class Studentdetails{
	public static void main(String[] args)
	{
		
  
        student[] ob = new student[3];
  
 
        ob[0] = new student(12,"neha",78,90,78);
        ob[1] = new student(78,"merlin",98,89,77);
		ob[2] = new student(89,"rizzz",78,99,90);
     
    ob[0].display();

	ob[1].display();
	
	ob[2].display();

	
	
	
	
	
}
}