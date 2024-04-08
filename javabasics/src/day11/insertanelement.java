package day11;

import java.util.Scanner;

public class insertanelement {

	public static void main(String[] args) {
		int arr[]=new int[5];
		System.out.println("eneter the elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
         arr[i]=sc.nextInt();
		}
		System.out.println("print the elementsbefore insert");
for(int i:arr) {
	System.out.println(i);
}
System.out.println("enter the location to insert");
int location=sc.nextInt();
System.out.println("enter the value to insert");
int value=sc.nextInt();
for(int i=arr.length-1;i>location;i--) {
	arr[i]=arr[i-1];
}
arr[location]=value;
for(int i:arr) {
	System.out.println(i);
}
	}}
