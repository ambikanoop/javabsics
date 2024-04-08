package Assignmenthackthon;

import java.util.Scanner;

public class stringintoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
	String a=sc.nextLine();
		//System.out.println(a);
		int b=Integer.parseInt(a);
		System.out.println(b+10);

		
		int c=600;
		String e=Integer.toString(c);
		System.out.println(e);
		String v=String.valueOf(a);
		System.out.println(v);
	}

}
