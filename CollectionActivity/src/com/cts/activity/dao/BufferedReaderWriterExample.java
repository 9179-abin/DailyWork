package com.cts.activity.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExample {
	public static void main(String[] args) {
		String path1="C:\\Users\\Lenovo\\Desktop\\file.txt";
		File file = new File(path1);
		
		/*Writing file using BufferedWriter*/
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter =null;
		try {
			fileWriter=new FileWriter(file);
			bufferedWriter =new BufferedWriter(fileWriter);
			bufferedWriter.write("This is an example \n");
			bufferedWriter.write("of using BufferedWriter and \n");
			bufferedWriter.write("BufferedReader.");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fileWriter!=null){
					fileWriter.close();
				}
				if(bufferedWriter!=null){
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileReader =new FileReader(file);
			bufferedReader=new BufferedReader(fileReader);
			String line=null;
			while((line=bufferedReader.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fileReader!=null){
					fileReader.close();
				}
				if(bufferedReader!=null){
					bufferedReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}