package day11;
import java.util.Scanner;
public class countthenumberofdigits {
public static void main(String[] args) {
	
	int num;
System.out.println("enter the number");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
int count=0;
while(num!=0) {
num=num/10;
count++;}{
	
System.out.println(count);
}


}
}
