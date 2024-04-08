package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class sortelementinthelist {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(700);
		ar.add(300);
		ar.add(600);
		ar.add(400);
		ar.add(600);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
	}

}
