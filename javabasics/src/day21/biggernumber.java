package day21;

import java.util.Scanner;

public class biggernumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		if(a>b&&a>c) {
			System.out.println("bigger number is:"+a);
		}else if(b>a&&b>c) {
			System.out.println("number is:"+b);
		}
		else {
			System.out.println("ans is:"+c);
		}
			
		
	}

}
