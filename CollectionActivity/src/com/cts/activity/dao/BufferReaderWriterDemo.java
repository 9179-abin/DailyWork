package com.cts.activity.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class BufferReaderWriterDemo{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String path1="C:\\Users\\Lenovo\\Desktop\\file1.txt";
		File file=new File(path1);
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("This is BufferedWriter");
		
		bw.close();
		fw.close();
	}
}
