package javabasics;

import java.util.Scanner;

public class rectangle {


	public static void main(String arags[]) {
	
		int l ;
		int b;
		
		int area;
		int pa;
Scanner sc=new Scanner(System.in);


System.out.println("enter the height:");
l=sc.nextInt();

System.out.println("enter the width:");
b=sc.nextInt();
area=l*b;
pa=(2*(l*b));
System.out.println("area is "+area);
System.out.println("perimeter is:"+pa);
	
	
	
}
	  


	
}