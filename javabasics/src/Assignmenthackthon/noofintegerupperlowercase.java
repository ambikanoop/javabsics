package Assignmenthackthon;

import java.util.Scanner;

public class noofintegerupperlowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		int upper=0,lower=0,number=0,special=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&& ch <='Z')
				upper++;
			else if(ch>='a'&&ch<='z')
				lower++;
			else if(ch>='0'&&ch<='9')
				number++;
			else
				special++;
			}
		System.out.println("uppercase:"+upper);
		System.out.println("lowercase:"+lower);
		System.out.println("numbercase:"+number);
		System.out.println("special charecter:"+special);

	}

}
