package javabasics;

import java.util.Scanner;

public class mul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	for(int i=1;i<=15;i++) {
		System.out.println(num+"*"+i+"="+(num*i));
	}
   
	}

}
