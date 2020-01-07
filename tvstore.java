/*
4. Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP?

*/

import java.util.*;
public class tvstore {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String c;
		int v,size;
		double prize,f;
		System.out.println("Enter the TV type:");
		c=sc.nextLine();
		if(c.equals("CRT")) {
			System.out.println("The Selling prize:"+5000);
			v=5000;
			f= v*0.05;
			prize=(v-f);
			System.out.println("The discounted prize of "+c+" : "+prize);
		}
		else if(c.equals("LCD")) {
			System.out.println("Enter the size of "+c+" TV:");
			size=sc.nextInt();
			if(size==14) {
				System.out.println("The Selling prize:"+12999);
				v=12999;
				f= v*0.08;
				prize=(v-f);
				System.out.println("The discounted prize of "+c+" : "+prize);
			}
			else if(size==21) {
				System.out.println("The Selling prize:"+21000);
				v=21000;
				f= v*0.10;
				prize=(v-f);
				System.out.println("The discounted prize of "+c+" : "+prize);
			}
		}
		
		
	}

}
