package com.cts.data;
import java.util.ArrayList;
import java.util.Collections;
public class ArryList {
	public static void main(String[] args) {
		ArrayList<Employ> list= new ArrayList<Employ>();
		Employ emp1 = new Employ(281,"Abin","Kerala",30,424325252,546456.00);
		Employ emp2 = new Employ(250,"Kevin","Delhi",29,876825252,543546.00);
		Employ emp3 = new Employ(213,"Sam","Chennai",22,765755755,877687.00);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		//SortById sbi=new SortById();
		//Collections.sort(list,sbi);//We cannot use this to sort user defined objects
		Collections.sort(list,new SortByName());
		for(Employ emp : list ) {
			System.out.println(emp);
		}
	}
	
	
}
