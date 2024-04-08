package javacollection;

import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
	TreeSet tt=new TreeSet();
	tt.add(100);          //hetrogenous not allowed
	tt.add(300);   //sort
	tt.add(200);   //not allowed duplicate
	tt.add(500);  //null are not allowed
	System.out.println(tt);
	
	for(Object t1:tt) {
		System.out.println(t1);
	}
	

	}

}
