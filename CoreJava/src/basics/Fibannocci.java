package basics;
import java.util.*;
public class Fibannocci {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0,num=0;
		System.out.println("Enter the range: ");
		num=sc.nextInt();
		c=a+b;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<num-2;i++) {
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
