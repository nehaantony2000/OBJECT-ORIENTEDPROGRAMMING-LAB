import java.util.*;

class StringManip

{

	String s1;

	String s2;

	int len;

	Scanner sc=new Scanner(System.in);

	String concat_string(String str1,String str2)

	{

	 return str1.concat(str2);

	}

	int countLength(String str1)

	{

	 return str1.length();

	}

	String caseConvert(String str1)

	{

	 if(str1.equals(str1.toUpperCase()))

		return str1.toLowerCase();

	 else

		return str1.toUpperCase();

	}

	String replaceSubstring(String str1,String str2,String str3)

	{

	 return str1.replace(str3,str2);

	}

	String sortString(String str1)

	{

	  char[] a=new char[str1.length()];

	  a=str1.toCharArray();

	  Arrays.sort(a);

	  str1=new String(a);

	  return str1;

	}

	int returnCharPos(String str1,char ch)

	{

	 return str1.indexOf(ch);

	}

}

public class StringManipulation

{

	public static void main(String args[])

	{

	 StringManip ob=new StringManip();

	 int opt;

	 String str1,str2,str3;

	 char ch;

	 Scanner sc=new Scanner(System.in);

	 do

	 {
       System.out.println("__________Menu________________________");
	   System.out.println(" 1. FIND AN INDEX OF A CHARACTER IN A STRING");
	   System.out.println(" 2. CONCATENATE TWO STRINGS");
	   System.out.println(" 3. REPLACE A SUBSTRING");
	   System.out.println(" 4. SEE THE LENGTH OF A STRING");
	   System.out.println(" 5. CONVERT THE CASE OF STRING");
	   System.out.println(" 6. EXIT");
	     System.out.println("____________________________________________");
       System.out.println("Enter your option=");
	   opt=sc.nextInt();
       switch(opt)

	   {

		case 1:  sc.nextLine();

				 System.out.println("Enter a string : ");

				 str1=sc.nextLine();

				 System.out.println(" Enter a character to be searched: ");

				 ch=sc.next().charAt(0);

				 System.out.println(" The character "+ch+" found at "+ob.returnCharPos(str1,ch)+" in the string "+str1);

				 break;

		case 2:  sc.nextLine();

				 System.out.println(" Enter string 1: ");

				 str1=sc.nextLine();

				 System.out.println(" Enter string 2: ");

				 str2=sc.nextLine();

				 System.out.println("After concatenating the above string, we get "+ob.concat_string(str1,str2));

				 break;

		case 3: sc.nextLine();

				System.out.println(" Enter a string : ");

				str1=sc.nextLine();

				System.out.println(" Enter a word:  ");

				str2=sc.nextLine();

				System.out.println(" Enter a substring : ");

				str3=sc.nextLine();

				if(str1.contains(str3))

				System.out.println("Replacing "+str3+" with the word "+str2+" and the result is : "+ob.replaceSubstring(str1,str2,str3));

				else

				System.out.println(" Substring do not match !!!");

				break;

		case 4: sc.nextLine();

				System.out.println(" Enter a string : ");

				str1=sc.nextLine();

				System.out.println(" The length of the string is : "+ob.countLength(str1));

				break;

		case 5: sc.nextLine();

				System.out.println(" Enter a string to be converted: (Enter either in capital or not)");

				str2=sc.nextLine();

				if(str2.equals(str2.toUpperCase())==false && str2.equals(str2.toLowerCase())==false)

					System.out.println(" Enter in correct format\n");

				System.out.println(" The converted string is : "+ob.caseConvert(str2));

				break;

		case 6: System.exit(0);

		

		default: System.out.println(" INVALID CHOICE !!!");

	   }

	 }

	 while(opt!=6);

	}

}