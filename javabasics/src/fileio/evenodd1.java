package fileio;
import java.util.Scanner;
public class evenodd1 {
	public static void main(String[] args) {
		 int n ;
		
		 Scanner sc=new Scanner(System.in);
	
		 n=sc.nextInt();
		 System.out.print("enter the number:" +n);
		
		 if(n%2!=0||n%2==0&&n>=6&&n<=20) {
			 System.out.println("weird");
		 }
			 else if(n%2==0&&n>=2&&n<=5||n>20&&n<=100) {
				 System.out.println("not weird");
			 }
				 else {
					 System.out.println("not in thr range");
				 }
			 }
		 
		 
	}

