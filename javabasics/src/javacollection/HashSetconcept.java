package javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetconcept {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//default capacity 16 load factor 0.75
		
		//HashSet hs1=new HashSet(100);//initial  capacity 100 
		//HashSet hs2=new HashSet(100,(float)0.90);//initial capacity 100 load factor 0.90
		//HashSet<Integer> hs1=new HashSet<Integer>();
		//add objects or elements into hashset
		hs.add(100);
		hs.add("welcome");//duplicate not allowed
		hs.add('a');      //insertion order is not reserved
		hs.add(200);
		hs.add(300);
		System.out.println(hs);
		hs.remove(200);
		System.out.println("after removing"+hs);
		hs.contains(200);
		System.out.println(hs.contains(200));
		System.out.println(hs.isEmpty());
		//for each read element from the hashset
		/*for(Object e:hs) {
			System.out.println(e);*/
			
			//Iterator method
			Iterator it=hs.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			
				
			}
			
		}
		
		
	}


