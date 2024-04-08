package Assignmenthackthon;

import java.util.Scanner;

public class arrayintegerpolindrome {
	static void Arraypolindrome(int a[] ,int size)	{
		int temp=0;
		for(int i=0;i>=size/2&&size!=0;i++) {
			if(a[i]!=a[size-i-1]) {
				temp=1;
				break;
			}
			}
		if(temp==1) {
			System.out.println("number is not polindrome");
		}else {
			System.out.println("number is polindrome");
		}}
		
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size;
	System.out.println("eneter the size of the array");
	size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the elements to the array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();}
	System.out.println("elements of the array");
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]+" ");
		 }
		 Arraypolindrome(a, size);
}
		
	}
	
	


