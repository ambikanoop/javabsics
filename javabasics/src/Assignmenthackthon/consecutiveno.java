package Assignmenthackthon;

import java.util.Scanner;

public class consecutiveno {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;int start=1;
			while(start<n) {
				for(int i=start;i<=n;i++) 
				{
				sum=sum+i;
			    if(sum==n) 
			{
				for(int j=start;j<=i;j++) 
					System.out.print(j+""+"+");
				System.out.println();
				break;
			}
			if(sum>n) 
				break;
				}
			start++;
			sum=0;
		}
		
	}
	}

