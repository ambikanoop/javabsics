package javabasics2;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
int count=0;

Scanner sc= new Scanner(System.in);

System.out.println("enter the number");
num=sc.nextInt();
if(num>1) {
	for (int i=1;i<=num;i++) {
		if(num%i==0)
			count++;
	}
		if(count==2) {
			System.out.println("is a prime number");
		}
		else {
			System.out.println("is not a prime number");
		}
	}
	else {
	System.out.println("not a prime number");
}}}
