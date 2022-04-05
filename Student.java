 class stud
{
	int id;
	String Sname;
	float m1,m2,m3;
	
	public stud(int id,String name,float m1,float m2,float m3)
	{
		id=id;
		Sname=name;
		m1=m1;
		m2=m2;
		m3=m3;
	}
	public stud()
	{
		id=45;
		Sname="neha";
		m1=98;
		m2=89;
		m3=90;
	}
public void display()
	{
		System.out.println("The Student Name=" + Sname);
		System.out.println("The Student id=" +id);
		System.out.println("Marks are =" +m1 +m2 +m3);
	}
	
}   
 public class Student{
	public static void main(String[] args)
	{
	stud ob = new stud();
    ob.display();
	stud ob1= new stud(23,"manju",78,56,44);
	ob1.display();
}
}