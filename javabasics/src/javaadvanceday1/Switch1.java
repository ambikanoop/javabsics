package javaadvanceday1;

import java.util.Scanner;

public class Switch1 {
public static void main(String[] args) {
	int car;
	Scanner sc=new Scanner(System.in);
	car=sc.nextInt();
	System.out.println("enter the number:"+car);
	switch(car) {
	case 1:System.out.println("bmw");
	break;
	case 2:System.out.println("honda");
	break;
	case 3:System.out.println("audi");
	break;
	case 4:System.out.println("nissan");
	break;
	default:System.out.println("nothing");
	
		
	}
	}
	
	
	

}
