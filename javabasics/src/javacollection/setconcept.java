package javacollection;

import java.util.HashSet;

public class setconcept {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(200);    //insertion order not preserved
		hs.add(300);     //duplicate are not allowed
		hs.add(400);   //can not access data by index
		hs.add(800);
		hs.add(19);
		hs.add(200);
		
	
		//System.out.println(hs);
		for(int hs1:hs) {
			System.out.println(hs1);
		}
	}

}
