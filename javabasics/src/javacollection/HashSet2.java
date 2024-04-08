package javacollection;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Integer> evennumber=new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		System.out.println(evennumber);
		HashSet<Integer> number=new HashSet<Integer>();
		number.addAll(evennumber);
		number.add(10);
		System.out.println("new hshset"+number);
		//removeall method
		number.removeAll(evennumber);
		System.out.println("after removing"+number);

	}

}
