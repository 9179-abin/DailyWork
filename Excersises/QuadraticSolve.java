package basics;
import java.util.*;
public class QuadraticSolve {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quadratic Equation: ax^2+bx+c=0");
		int a,b,c,d=-2;
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		c=sc.nextInt();
		double s1,s2;
		s1=(-b-Math.sqrt((b*b)-4*a*c));
		s1=(s1/(2*a));
		System.out.println("Solution 1: "+s1);
		s2=(-b+Math.sqrt((b*b)-4*a*c));
		s2=(s2/(2*a));
		System.out.println("Solution 2: "+s2);
	}

}
