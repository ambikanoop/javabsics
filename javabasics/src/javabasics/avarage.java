package javabasics;

import java.util.Scanner;

public class avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=3;

System.out.println("enter the three number;" +number);
Scanner sc =new Scanner(System.in);
/*k =sc.nextInt();*/
int k,sum=0;
float average=0;

for(int i=0;i<3;i++) {
	k=sc.nextInt();
	sum=sum+k;
	
	
}
average=sum/number;
System.out.println("sum of three number:"+sum);
System.out.println("average of 3 number is:" +average);

	}

}
