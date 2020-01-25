package basics;
import java.util.*;
public class Swap {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter 1st number: ");
		a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Afte Swap\n");
		System.out.println("The 1st number: "+a+", The 2nd number: "+b);

	}

}
