package javabasics2;

public class encap {
public static void main(String[] args) {
	
	encapsulation en = new encapsulation();
	
	/*en.age=7;          // sring as privite in encapsulation .not able to acces//
	en.name="anuska";
	System.out.println(en.age);
	System.out.println(en.name);*/
	
	
	en.setName("akshadha");
	System.out.println(en.getName());
}
}
