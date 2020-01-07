/*
5. Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest?
*/
import java.util.*;
public class interview {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String a;
		int c,b,d;
		System.out.println("Enter your name:");
		a=sc.nextLine();
		System.out.println("Enter your 1st test mark:");
		c=sc.nextInt();
		if(c>=75) {
			System.out.println("Enter your 2nd test mark:");
			b=sc.nextInt();
			if(b>=75) {
				d=(c+b)/2;
				if(d>80) {
					System.out.println(c+", You are selected for interview");
				}
				else {
					System.out.println(c+", Your criterias are not sufficient");
				}
			}
		}
	}

}
