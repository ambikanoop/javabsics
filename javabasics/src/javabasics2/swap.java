package javabasics2;
import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
System.out.println("enter any two number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before swapping:"+a+" "+b);
a=a+b;  //10+20=30
b=a-b;	//30-20=10
a=a-b;//30-10=20
System.out.println("after swapping:"+a+" "+b);
}}
