package javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistmethods {

	public static void main(String[] args) {
		//declare arrayList//
		//ArrayList al=new ArrayList();
//homegenous arraylist declare
		//ArrayList<String> al= new ArrayList<String>();
		//ArrayList<Integer> al=new ArrayList<Integer>();
		//List al=new ArrayList();
		ArrayList al=new ArrayList();
		//add elements to the arraylist
		al.add(100);
		al.add("welcome");
		al.add(14.7);
		al.add('a');
		al.add(true);
		System.out.println(al);
		System.out.println("number of element in "+al.size());
	//al.remove(1);
	al.remove("welcome");
	System.out.println("after removing element "+al);
	al.add(2, 89);
	System.out.println("after insertion element "+al);
	al.get(2);
	System.out.println(al.get(2));//extract specific value  2 is index
	al.set(0, 102);//replace the new value
	System.out.println("after replacing element"+al);
	al.contains('a');//search element
	System.out.println(al.contains('a'));
	//isEmpty()
	System.out.println(al.isEmpty());
	//read from for loop
	
	/*for(int i=0;i<al.size();i++) {
		
	/*System.out.println(al.get(i));*/
	//for each loop
	for(Object e:al) {
	System.out.println(e);
	}
	Iterator it=al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
	}
	
	
	
	
	
	
	}


