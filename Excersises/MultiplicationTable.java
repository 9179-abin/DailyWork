package basics;
import java.util.*;
public class MultiplicationTable {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the number: ");
		a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+" * "+i+" = "+a*i+"\n");
		}
	}

}
