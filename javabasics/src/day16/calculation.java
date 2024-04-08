package day16;

public class calculation {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void sum(double x,double y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		calculation sc=new calculation();
		sc.add(6, 7);
		sc.add(6, 8, 9);
sc.sum(2.7, 8.7);
	}

}
