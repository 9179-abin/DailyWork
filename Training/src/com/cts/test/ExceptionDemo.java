package com.cts.test;
import java.util.*;
public class ExceptionDemo{
	public static boolean isValidUser(String name) throws InvalidUser {
		if(!name.equals("admin")) {
			throw new InvalidUser("Invalid");
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		try {
			isValidUser("Abin");
		}
		catch(InvalidUser ex) {
			System.out.println(ex.invalid());
		}
	}
}
class InvalidUser extends Exception
{
	public InvalidUser() {
		
	}
	InvalidUser(String message){
		System.out.println(message);
	}
	public String invalid() {
		return "This user is invalid";
	}
}