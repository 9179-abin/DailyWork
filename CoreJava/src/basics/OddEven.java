package basics;
import java.util.*;
public class OddEven {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check even or odd: ");
		int g=sc.nextInt();
		if(g%2==0) {
			System.out.println("The number "+g+" is even number");
		}
		else {
			System.out.println("the number "+g+" is Odd number");
		}

	}

}
