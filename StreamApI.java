package com.cts.activity.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();
		addNames(names);
		
		names.forEach(System.out::println);
		
		List<String> lengthScale = names.stream().filter(s -> s.length()>= 7).collect(Collectors.toList());
		System.out.println("the name which has length greater than 7: \n");
		lengthScale.forEach(System.out::println);
		
		//Print all the name in capital letter
		List<String> camNames=names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		camNames.forEach(System.out::println);
		}

	private static void addNames(List<String> names) {
		// TODO Auto-generated method stub
		names.add("Abin Joshy");
		names.add("Aniket Andhale");
		names.add("NagaSri");
		names.add("Syed");
	}

}
