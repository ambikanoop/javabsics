package javaadvanceday1;

public class wrapperclass {

	public static void main(String[] args) {
		int a=10;
		Integer a2=new Integer(a);
		
		System.out.println(a2.floatValue());
		int a4=a2;
		System.out.println(a4);
	}

}
