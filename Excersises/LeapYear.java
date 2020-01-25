package basics;
import java.util.*;
public class LeapYear {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year you want to check: ");
		long a=sc.nextLong();
		if(a%100==0 && a%400==0) {
			System.out.println("Its a leap year");
		}
		else if(a%4==0 && (a%100)!=0){
			System.out.println("Its a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
