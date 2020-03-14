package basics;
import java.util.*;
public class FindGCD {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,m=0;
		System.out.println(" GCD(a,b) ");
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		int p=a;
		int q=b;
		while(a!=0) {
			if(a%b==0) {
				System.out.println("The GCD("+p+","+q+") = "+m);
				break;
			}
			else {
				m=a%b;
				a=b;
				b=m;
					
			}
		}
	}

}
