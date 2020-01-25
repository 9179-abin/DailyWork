package basics;
import java.util.*;
public class ReverseNum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n,n1,r=0,m;
		// TODO Auto-generated method stub
		System.out.println("enter the number to be reversed: ");
		n=sc.nextInt();
		m=n;
		while(n!=0) {
			n1=n%10;
			n=n/10;
			r=r*10+n1;
		}
		if(r==m) {
			System.out.println("The number is Pallingdrom");
		}
		else {
			System.out.println("Not a Pallingdrom number");
		}

	}

}
