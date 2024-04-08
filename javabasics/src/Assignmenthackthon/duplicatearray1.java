package Assignmenthackthon;

import java.util.Scanner;

public class duplicatearray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
	
		System.out.println("eneter the elements to the array");
		for(int i=0;i<=size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("read the elements of the array");
		for(int arr:a) {
		System.out.println(arr);
			}

}}
