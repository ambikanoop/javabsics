package javacollection;

import java.util.LinkedList;

public class spcilamethodlinkedlist {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("hi");
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("cat");
		System.out.println(l);
		l.addFirst("welcome");
		System.out.println(l);
		l.addLast("end");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		System.out.println(l);
	}

}
