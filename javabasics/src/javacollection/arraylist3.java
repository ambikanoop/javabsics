package javacollection;

import java.util.ArrayList;
import java.util.Arrays;

import day11.arrayspecificvalue;

public class arraylist3 {

	public static void main(String[] args) {
	String arr[]= {"dog","cat","tiger"};
	for(String v:arr) {
		System.out.println(v);
	}
ArrayList al=new ArrayList(Arrays.asList(arr));
System.out.println(al);
	}

}
