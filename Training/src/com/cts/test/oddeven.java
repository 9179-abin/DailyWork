package com.cts.test;
import java.util.*;
public class oddeven {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,o=0,e=0,odd[],even[];
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			if(ar[i]%2==0) {
				e+=1;
			}
			else {
				o+=1;
			}
		}
		odd=new int[o];
		even=new int[e];
		int p=0;
		int q=0;
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0 && p<e) {
				even[p]=ar[i];
				p+=1;
			}
			else if(ar[i]%2!=0 && q<o) {
				odd[q]=ar[i];
				q+=1;
			}
		}
		System.out.println("The Even elements are:");
		for(int i=0;i<e;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println(" ");
		System.out.println("The Odd elements are:");
		for(int i=0;i<o;i++) {
			System.out.print(odd[i]+" ");
		}
		
	}

}
