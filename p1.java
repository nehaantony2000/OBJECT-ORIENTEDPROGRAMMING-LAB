import java.io.File;
import java.io.*;
import java.util.*;
public class p1 {

	public static int flag=0;
	static void RecursivePrint(File[] arr, int index, int level, String searchfor) {
		// exit condition
		if (index == arr.length)
			return;
		for (int i = 0; i < level; i++)
System.out.print("=>");

		if (arr[index].getName().toLowerCase().contains(searchfor))

			flag=1;
		if (arr[index].isFile())
			System.out.println(arr[index].getName());
		else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName() + "]");
			RecursivePrint(arr[index].listFiles(), 0, level + 1, searchfor);
		}
		RecursivePrint(arr, ++index, level, searchfor);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the directory path");
		String maindirpath = in.nextLine();
		System.out.println("Enter the file/directory name to search");
		String searchfor = in.nextLine();
		File maindir = new File(maindirpath);

		if(maindir.exists() && maindir.isDirectory())
			{
			File arr[] = maindir.listFiles();
			System.out.println("_______________________________________________________________");
			System.out.println("Files from main directory" + maindir);
			System.out.println("_________________________________________________________________");
			RecursivePrint(arr, 0, 0, searchfor.toLowerCase()); // array,index,level,search
		}
		if(flag==1){
			System.out.println("file is found");
		}
		else{
			System.out.println("file doesnot found");
		}
	}
}