/*
8. Write a Program to accept the age of the user and then, display the category of the
   user. Based on the age, the categories of the users are:
	05-12 Children
	13-19 Teenagers
	20-35 Young adults
	36-45 Mature adults
	46-55 Elders
	56 and above Seniors ?
	
	
*/
import java.util.*;
public class agetell {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		System.out.println("Enter your age:");
		a=sc.nextInt();
		if(a>=5 && a<=12) {
			System.out.println("Children");
		}
		else if(a<=19) {
			System.out.println("Teenagers");
		}
		else if(a<=35) {
			System.out.println("Young Adult");
		}
		else if(a<=45) {
			System.out.println("Mature Adult");
		}
		else if(a<=55) {
			System.out.println("Elders");
		}
		else if(a>56 && a<70) {
			System.out.println("Seniors");
		}
	}

}
