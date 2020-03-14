package com.cts.activity.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//Read data from one file and write it into another
		String path="C:\\Users\\Lenovo\\Desktop\\data.txt";
		String path2="C:\\Users\\Lenovo\\Desktop\\data1.txt";
		//File file=new File(path);
		FileInputStream fin=new FileInputStream(path);
		FileOutputStream fout=new FileOutputStream(path2);
		int i;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
			fout.write(i);
		}
		fin.close();
//		System.out.println("Can Execute ?"+file.canExecute());
//		System.out.println("Can Read ?"+file.canRead());
//		System.out.println("Can Write ?"+file.canWrite());
//		System.out.println("File exists ?"+file.exists());
//		System.out.println("Absolute path?"+file.getAbsolutePath());
//		FileOutputStream fout=new FileOutputStream(file,true);
//		String msg=sc.nextLine();
//		byte[] b=msg.getBytes();
//		fout.write(b);
//		fout.close();
	}

}
