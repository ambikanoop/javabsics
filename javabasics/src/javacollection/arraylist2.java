package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("d");
		al.add("y");
		al.add("a");
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		System.out.println(al1);
		al1.removeAll(al);
		System.out.println("after removing:"+al1);	
		System.out.println("elements in the arraylist"+al);
		Collections.sort(al);
		System.out.println("after sorting elements"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("reverse order"+al);
	}

}
