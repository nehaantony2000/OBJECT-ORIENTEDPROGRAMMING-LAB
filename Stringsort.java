import java.util.*;
public class Stringsort
{
static Scanner s=new Scanner(System.in);
public static void main(String args[])
{
String temp;
String[] A=new String[8];
int a;
System.out.println("enter the size of the array");
a=s.nextInt();
System.out.println("enter the Strings into the array");
for(int i=0;i<=a;i++)
{
A[i]=s.nextLine();
}
System.out.println("Sorted array elements:");
for(int i=0;i<=a;i++)
{
for(int j=i+1;j<=a;j++)
if(A[i].compareTo(A[j])>0)
{
temp=A[i];
A[i]=A[j];
A[j]=temp;
}
}
for(int i=0;i<=a;i++)
{
System.out.println(A[i]);
}
}
}
