import java.util.*;
class Student
{
    int rno,m1,m2,m3;
    public Student(int rno,int m1,int m2,int m3)
    {
        this.rno=rno;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
}
class Sports extends Student
{
    int score;
    public  Sports(int rno,int m1,int m2,int m3,int score)
    {
        super(rno,m1,m2,m3);
        this.score=score;
    }
}
class Result extends Sports
{
     public Result(int rno,int m1,int m2,int m3,int score)
    {
        super(rno,m1,m2,m3,score);
    }
   public int calc(int m1,int m2,int m3,int score)
    {
        int total=0;
        total=total+m1+m2+m3+score;
        return total;
    }
    void display()
    {
        System.out.println("Roll no=" +rno);
        
        System.out.println("___________________________________________________________");
        System.out.println(" English \t Maths \t Computer \t Sports Score");
        System.out.println(m1 +"\t\t"+ m2 +"\t\t" +m3 +"\t\t"+ score);
        System.out.println("______________________________________________________________");    
    }
}
public class MarkList
{
    public static void main(String args[])
    {   int Total,rno,m1,m2,m3,score;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Rollno=");
        rno=in.nextInt();
        System.out.println("Enter the English marks=");
        m1=in.nextInt();
        System.out.println("Enter the Maths marks=");
        m2=in.nextInt();
        System.out.println("Enter the ComputerScience marks=");
        m3=in.nextInt();
        System.out.println("enter the sports score=");
        score=in.nextInt();
        Result r=new Result(rno,m1,m2,m3,score);
        Total=r.calc(m1,m2,m3,score);
        r.display();
        System.out.println("\t\t\t\t Final Result=" +Total);
    }
}
