package Assignmenthackthon;

import java.util.Scanner;

public class factorialrecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int result=fact(a);
		System.out.println(result);
		
	}
	static int fact(int a) {
		if(a==0)
			return 1;
		else
			return a*fact(a-1);
	}

}
