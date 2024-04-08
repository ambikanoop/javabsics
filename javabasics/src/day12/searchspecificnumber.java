package day12;
import java.util.Scanner;
public class searchspecificnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,6,7,8,8,9};
int n,i;
int count=0;
Scanner sc=new Scanner(System.in);

System.out.println("enter the element:");
n=sc.nextInt();
for(i=0;i<a.length;i++) {
	if(a[i]==n) {
		count++;
		
	}}
	if (count>0)
	{
		System.out.println("item found"+" :" +count+" times");
	}  else
	{
		System.out.println("item not found");
	}
	
		
	}
}
	


