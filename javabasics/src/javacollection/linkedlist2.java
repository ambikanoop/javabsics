package javacollection;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist2 {

	public static void main(String[] args) {
		
LinkedList l=new LinkedList();
   l.add(900);
   l.add(400);
   l.add(600);
   l.add(800);
   System.out.println(l);
   LinkedList l2=new LinkedList();
   l2.addAll(l);
   System.out.println("after: "+l2);
   l2.removeAll(l);
   System.out.println("after remove"+l2);
   System.out.println("before sorting"+l);
   Collections.sort(l);
   System.out.println("after sorting:"+l);
   Collections.sort(l,Collections.reverseOrder());
   System.out.println("after reverse"+l);
   Collections.shuffle(l);
   System.out.println("after shuffling"+l);

	}

}
