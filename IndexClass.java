package javaEclipseTest;

import java.util.Scanner;
public class IndexClass {
	
	static String newPassword;
	
	public static void main(String[] args) {
		userInput();
		
		EncapsulationTest encap = new EncapsulationTest();
		encap.setPassword(newPassword);
	
		
		
		System.out.print("New password: "+encap.getPassword()+"\n"+"Email: "+encap.getEmail());
	}
	
	public static void userInput()
	{
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Enter new password: ");
		newPassword = inputUser.next();
		
		inputUser.close();
	}
}
