package inheritance;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
	int num;
	int count=0;
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
	num=sc.nextInt();
	
	if(num>1) {
		
		for(int i=1;i<=num;i++) {
		if(num%i==0)
		count++;
		}
		if(count==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");	
		}}
	
	else System.out.println("not a prime ");
	}}
