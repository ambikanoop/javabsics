package Assignmenthackthon;

import java.util.Scanner;

public class polidrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
	String	rev="";
	int b=s.length();
	for(int i=b-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		
		//System.out.println("reverse string is:"+rev);
	}
	if(s.equals(rev)) {
		System.out.println("string is plondrome");
	}else {
		System.out.println("string is not polindrome");
	}
	}

}
