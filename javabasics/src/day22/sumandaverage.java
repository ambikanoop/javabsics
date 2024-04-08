package day22;

import java.util.Scanner;

public class sumandaverage {

	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
        d=a+b+c;
        System.out.println("sum of three numbers:"+d);
        e=a+b+c/3;
        System.out.println("avarage of three numbers:"+e);
	}

}
