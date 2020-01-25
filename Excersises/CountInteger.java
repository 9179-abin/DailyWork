package basics;
import java.util.*;
public class CountInteger {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		long num=0;
		int count=0;
		num=sc.nextLong();
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("The no. is: "+count);
	}

}
