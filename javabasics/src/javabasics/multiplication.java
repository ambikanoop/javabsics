package javabasics;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i;

Scanner sc=new Scanner(System.in);
System.out.println("eneter the number");
num=sc.nextInt();
for( i=1;i<=10;i++) {
	System.out.println(num+"*"+i+"="+(num*i));
}

	}

}
