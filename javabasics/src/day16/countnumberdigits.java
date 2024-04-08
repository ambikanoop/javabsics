package day16;

import java.util.Scanner;

public class countnumberdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int even_count=0;
int odd_count=0;
//int count=0;
/*while(a>0) {
	a=a/10;
	count++;
}
System.out.println(count);*/
while(a>0) {
	int rem;
	rem=a%10;


if(rem %2==0) {
	even_count++;
	//System.out.println("number is even");
}else {
	odd_count++;
	//System.out.println("number is odd");
}
a=a/10;


	}
System.out.println("number of even count:"+even_count);
System.out.println("number of odd number:"+odd_count);
}
}