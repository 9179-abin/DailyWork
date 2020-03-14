package basics;
import java.util.*;
public class AlphabetCheck {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter the character: ");
		ch=sc.next().charAt(0);
		int g=ch;
		if((g>=97 && g<=122) || (g>=65 && g<=90)) {
			System.out.println("Its an alphabet");
		}
		else {
			System.out.println("The character is not an alphabet");
		}
	}

}
