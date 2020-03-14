package com.cts.data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(12,4,22,67,15,18,7));
		System.out.println(list);
		Collections.sort(list);//Sorting array list
		System.out.println(list);
		}

}
