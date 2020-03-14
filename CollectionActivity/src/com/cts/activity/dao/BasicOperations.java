package com.cts.activity.dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {

	public static void main(String[] args) throws IOException{
		FileSystem fs=FileSystems.getDefault();
		//Path path=fs.getPath("C:","Users","Lenovo","Desktop","MyProject","DailyWork");
		Path path=Paths.get("C:","Users","Lenovo","Desktop","Demo");
//		Path fileToCreatePath = path.resolve("test-file.txt");
//		System.out.println("Name Count: "+path.getNameCount());
//		System.out.println("Is Absolute: "+path.isAbsolute());
//		System.out.println("Name on Index 2: "+path.getName(2));
//		Path newFilePath = Files.createFile(path.resolve("test-file.txt"));
//		Path dir=Files.createDirectory(dir, attrs);
		Files.createDirectories(path);
		Path path2=Paths.get("C:","Users","Lenovo","Desktop","Demo","text_file.txt");
		Files.createFile(path2);
		if(Files.exists(path2)) {
			System.out.println();
		}
	}
}
