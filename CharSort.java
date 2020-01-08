/*
 Consider the following unsorted list
    Neena Meeta Geeta Reeta Seeta
    Sort the list using selection sort algorithm. Show the status of the list after every iteration.
 
 */
package com.cts.test;
public class CharSort {
	public static void main(String[] args) {
		String temp=" ";
		String words[]= {"Neena", "Meeta", "Geeta", "Reeta", "Seeta"};
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
				}
			}
		}
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}
}