package day16;

import java.util.Scanner;

public class palindrmornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
        String str= sc.next();
        String rev="";
       // String org_str=str;
        for(int i=str.length()-1;i>=0;i--) {
        	rev=rev+str.charAt(i);
        	//System.out.println(rev);
        	}
        if(str.equals(rev)) {
        	System.out.println("word is palindrm");
        }else {
        	System.out.println("word is not palindrm");
        }
	}

}
