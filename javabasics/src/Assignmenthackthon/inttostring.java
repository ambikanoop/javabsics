package Assignmenthackthon;

import java.util.Scanner;

public class inttostring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int a=sc.nextInt();

		
		String e=Integer.toString(a);
		System.out.println(e);
		String v=String.valueOf(a);
		System.out.println(v);
	}

}
