package javacollection;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet hs= new LinkedHashSet();
		//LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>()
		
		hs.add(100);
		hs.add(650);
		hs.add(300);
		hs.add(600);
		hs.add(500);
		System.out.println(hs);
	}

}
