package javabasics2;

public class greatestof3numbers {
public static void main(String[] args) {
	
	int a=5;
	int b=17;
	int c=9;
	if(a>b&&a>c) {
		System.out.println("largest number is "+a);
	}
	else if  (b>a&&b>c) {
		System.out.println("largest number is "+b);
		
	}
	else {
		System.out.println("largest number  is "+c);
	}
		
	
	
}
}
