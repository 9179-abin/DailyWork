package basics;
import java.util.*;
public class PrintASCII {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		char c;
		int b;
		System.out.println("Enter any character: ");
		c=sc.next().charAt(0);
		b=c;
		System.out.println("The ASCII value of "+c+" is: "+b);
		
	}

}
