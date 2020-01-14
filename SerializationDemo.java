package com.cts.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cts.activity.bean.Employ;

public class SerializationDemo {

	public static void main(String[] args) {
		Employ employee = new Employ(123,"Sai Ram","Kohlapur",22,5678345,123456);
		try {
			serialization(employee,"serial.txt");
			
			Employ emp=(Employ) deserialize("serial.txt");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void serialization(Object obj, String fileName) throws IOException {
		FileOutputStream fout = new FileOutputStream(fileName);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		ObjectOutputStream out = new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();
	}
	public  static Object deserialize(String fileName) throws IOException {
		FileInputStream fin =new FileInputStream(fileName);
		BufferedInputStream bin = new BufferedInputStream(fin);
		ObjectInputStream ois = new ObjectInputStream(bin);
		return null;
	}
}
