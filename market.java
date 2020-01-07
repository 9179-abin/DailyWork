/*
3. You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system?
Output:
	Enter the Product you want to purchase:
	onion
	Enter the Quantity:
	6
	Total prize=600
*/
import java.util.*;
public class market{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String c;
		int a,prize;
		Dictionary market=new Hashtable();
		market.put("milk", 48);
		market.put("onion", 100);
		market.put("tomato", 55);
		System.out.println("Enter the Product you want to purchase:");
		c=sc.nextLine();
		System.out.println("Enter the Quantity:");
		a=sc.nextInt();
		if(market.get(c)!=null) {
			prize=(int)market.get(c)*a;
			System.out.println("Total prize="+prize);
		}
		else {
			System.out.println("The product not available");
		}
	}
}
