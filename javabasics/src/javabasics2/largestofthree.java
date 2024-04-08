package javabasics2;

import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("enter the first number:"+a );
		System.out.println("enter the second number:"+b );
		System.out.println("enter the third number:"+c);
	if(a>=b&&a>=c)
	System.out.println("largest number is:"+a);
	else if(b>=a&&b>=c)
		System.out.println("largest number is:"+b);
	else
		System.out.println("largest number is:"+c);
	
	
		
	}

}
