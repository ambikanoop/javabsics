package javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistconcept {

	public static void main(String[] args) {
		//declare linkedlist
     LinkedList l=new LinkedList();
    // LinkedList<Integer> l=new LinkedList<Integer>();
     //add elements into linkedlist
     l.add('x');
     l.add("hello");
     l.add(100);
     l.add(500);
     l.add(600);
     System.out.println(l);
     System.out.println(l.size());
     l.remove(0);
     System.out.println("after removing:"+l);
     l.add(2,300);
     System.out.println("after adding:"+l);
     l.add(1, "hi");
     System.out.println(l);
     //retriving value
     System.out.println(" retriving:"+l.get(2));
     //change the value
     l.set(3, "welcome");
     System.out.println("after the value change"+l);
     System.out.println(l.contains("hello"));
     System.out.println(l.isEmpty());
     //read element from for loop
    /* for(int i=0;i<l.size();i++) {
    	 System.out.println(l.get(i));*/
     
     //for each
    for(Object e:l) {
    	System.out.println(e);
    }
     
     //iterator method()
     
     Iterator it=l.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
     
     
     
     
     
     
     
    	 
     
     
     
	}

}
