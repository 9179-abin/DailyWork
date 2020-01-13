package com.cts.activity.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileWriter fw=null;
		String path1="C:\\Users\\Lenovo\\Desktop\\data1.txt";
		String path2="C:\\Users\\Lenovo\\Desktop\\data3.txt";
		fr=new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		fw=new FileWriter(path2);
		String i;
		while((i=br.readLine())!=null) {
			fw.write(i);
			fw.flush();
		}
		br.close();
		fw.close();
	}

}
