package com.cts.test;
public class string2 {
	
	public static void main(String[] args) {
		String jj="Global Warming";
		StringBuffer d=new StringBuffer();
		
		String ss=jj;
		boolean b;
		int c=ss.length()-4;
		System.out.println(ss.substring(c));
		System.out.println(ss.substring(4,9));
		System.out.println("Wheather string contains alpanumeric values:"+ss.matches("a-zA-Z0-9+"));
		ss=ss.substring(0,c);
		System.out.println(ss);
		System.out.println(ss.lastIndexOf("Wa"));
		ss=ss.toUpperCase();
		System.out.println(ss);
		int n=jj.length();
		//System.out.println(n);
		char[] src = jj.toCharArray();
		int g=src.length;
		for(int i=0;i<g;i++)
		{
			char l=jj.charAt(i);
			if(Character.isUpperCase(l)) {
				d.append(Character.toLowerCase(l));
			}
			else if(Character.isLowerCase(l))
			{
				d.append(Character.toUpperCase(l));
			}
			
			}
		System.out.println(d);
		
	}

}
