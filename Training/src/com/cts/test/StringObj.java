package com.cts.test;

public class StringObj {
	public static void main(String[] args) {
		String bb="Chaenanai";
		StringBuffer sb= new StringBuffer("Chennai");
		sb.append("Thoraipakkam");
		sb.insert(5,"ddddd");
		System.out.println(sb);
		sb.ensureCapacity(100);
		//sb.append(" Chennaichennai");
		System.out.println(sb.capacity());
		/*String hh="Thursday 9 January 2019";
		boolean gg;
		String[] date=bb.split("a");
		for(int i=0;i<hh.length();i++) {
			System.out.println(date[i]);
		}
		String nn=new String("Chennai");
		gg=equal(bb,hh);
		System.out.println(gg);*/
	}
	public static boolean equal(String bb,String hh) {
		return (bb.equals(hh));
			
		
	}

}
