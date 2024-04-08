package javacollection;

import java.util.HashSet;



public class moveelementfromhashsettoarraylist {

	public static void main(String[] args) {
	HashSet hs= new HashSet();
	hs.add(100);
	hs.add(100);
	//hs.add("welcome");//duplicate not allowed
	//hs.add('a');      //insertion order is not reserved
	hs.add(200);
	hs.add(300);
	System.out.println(hs);
 Integer arr[]=new Integer[hs.size()];
 hs.toArray(arr);
 
 for(Integer r:arr) {
 System.out.println(r);
	 
 }
	}

}
