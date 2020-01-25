package basics;
import java.util.*;
public class FindVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your alphabet: ");
		char ch;
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("The alphabet "+ch+" is a vowel");
			break;
		default:
			System.out.println("The alphabet "+ch+" is a comsonant");
			break;
		}
	}
}
