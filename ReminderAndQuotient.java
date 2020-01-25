package basics;
import java.util.*;
public class ReminderAndQuotient {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the divident number: ");
		int b=sc.nextInt();
		System.out.println("Enter the divisor number: ");
		int c=sc.nextInt();
		int r=b%c;
		System.out.println("The reminder: "+r);
		int q=b/c;
		System.out.println("The Quotient: "+q);

	}

}
