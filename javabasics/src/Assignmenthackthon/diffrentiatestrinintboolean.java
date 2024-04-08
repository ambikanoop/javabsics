package Assignmenthackthon;

import java.util.Scanner;

public class diffrentiatestrinintboolean {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the inpu");
	String input=sc.nextLine();
	if(isInteger(input)) {
		System.out.println("integer input"+Integer.parseInt(input));
	}else if (isBoolean(input)){
		System.out.println("boolean input"+Boolean.ParseBoolean(input));
	}else {
		System.out.println("String input"+input);
	}
	
	}
	

	private static boolean isInteger(String input) {
		try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }// TODO Auto-generated method stub
	
	


	private static boolean isBoolean(String input) {
		 return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
	}

	
	}


