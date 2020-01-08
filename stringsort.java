/*
Write a program which takes input as a string and sort all the alphabets in string.
    Example :
    1) If user gives input "helloword" then output string should be "dehllloorw".
    2) If user gives input "PROGRAMR" then output string should be "AGMOPRRR".
*/
import java.util.Arrays;
import java.util.Scanner;
public class stringsort {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String strg;
		System.out.println("Enter the string you want to sort:");
		strg=sc.nextLine();
		strsort(strg);
	}
	public static void strsort(String strg) {
		char[] cr=strg.toCharArray();
		Arrays.sort(cr);
		System.out.println("The sorted string is:"+new String(strg));
		
	}

}
