package basics;
import java.util.*;
public class Nsum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0;
		System.out.println("Enter the range of natural number: ");
		a=sc.nextInt();
		for(int i=0;i<a;i++) {
			sum+=i;
		}
		System.out.println("The sum: "+sum);
	}

}
