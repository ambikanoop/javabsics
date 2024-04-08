package Assignmenthackthon;

import java.util.Arrays;
import java.util.Scanner;

public class duplicatearray {

	public static void main(String[] args) {
	int a[]= {3,4,6,3,2,8,6};	
		
	Duplicatecout(a);
	}
static void Duplicatecout(int a[]) {
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++) {
		int count=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j])
				count++;
			else
				break;
		}
		if(count>1) {
			System.out.println(a[i]+"   "+count);
			i+=count-1;
		}
	}
}
}
