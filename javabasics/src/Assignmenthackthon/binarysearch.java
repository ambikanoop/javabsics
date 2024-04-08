package Assignmenthackthon;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			
            arr[i] = sc.nextInt();
		}
   System.out.println("elements of the array");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println("sorted array:"+arr);
		for(int num:arr) {
			System.out.println(num);
		}
		System.out.println("eneter the key");
		int key=sc.nextInt();
		int l=0;
		boolean flag=false;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==key) {
				System.out.println("key found");
				flag=true;
				break;
			}
			if(arr[mid]<key) {
				l=mid+1;
			}
			if(arr[mid]>key){
				h=mid-1;
				
			}
			}
		if(flag==false) {
			System.out.println("key is not found");
		}}}
