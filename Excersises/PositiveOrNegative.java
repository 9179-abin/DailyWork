package basics;
import java.util.*;
public class PositiveOrNegative {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the number: ");
		a=sc.nextInt();
		if(a<0) {
			System.out.println("The number is -ve");
		}
		else {
			System.out.println("The number is +ve");
		}

	}

}
