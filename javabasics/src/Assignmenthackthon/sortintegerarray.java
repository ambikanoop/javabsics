package Assignmenthackthon;

import java.util.Arrays;
import java.util.Scanner;

public class sortintegerarray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int arr_size=0;
	if(sc.hasNextInt()) {
		arr_size=sc.nextInt();
		//initializing array
		int[] arr=new int[arr_size];
		System.out.println("enter the elements to the array");
		for(int i=0;i<arr_size;i++) {
			if(sc.hasNextInt()) {
				arr[i]=sc.nextInt();
			}
		}
		System.out.println("elements of the arry");
		for(int i=0;i<arr_size;i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("sorted arry is");
		for(int num:arr) {
			System.out.println(num);
		}
	}  

	}

}
