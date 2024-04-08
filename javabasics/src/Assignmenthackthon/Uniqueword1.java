package Assignmenthackthon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Uniqueword1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//wrong
		System.out.println("enete the string");
		String str=sc.nextLine();
		String[]a=str.split(" ");
		HashSet<String>uword=new HashSet<String>(Arrays.asList(a));
		for(String s:uword) {
			System.out.println(s);
		}
	}

}
