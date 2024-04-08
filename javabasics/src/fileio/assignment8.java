package fileio;

import java.util.Scanner;

public class assignment8 {

	public static void main(String[] args) {
	int a;
	boolean b;
	double h;
	float f;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter int ");
	a=sc.nextInt();
	System.out.print("enter boolean ");
	b=sc.nextBoolean();
	System.out.print("enter  double ");
	h=sc.nextDouble();
	System.out.print("enter  float");
	f=sc.nextFloat();
	
	System.out.println("integer no a :"+"="+a);
	System.out.println(" boolean no b:"+"="+b);
	System.out.println(" double no h:"+"="+h);
	System.out.println(" float no f:"+"="+f);
	}

}
