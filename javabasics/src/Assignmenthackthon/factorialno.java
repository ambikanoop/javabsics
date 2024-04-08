package Assignmenthackthon;

import java.util.Scanner;

public class factorialno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in) ;
      System.out.println("enter the number");
    int a= sc.nextInt();
  int   fact=1;
    
		
			for(int i=a;i>0;i--) {
			fact=fact*i;
			
		}
		System.out.println("factorial of given number is:"+fact);
		
	}

}
